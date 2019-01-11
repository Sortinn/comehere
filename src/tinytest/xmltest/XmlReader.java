package tinytest.xmltest;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.json.XML;

import java.io.*;

/**
 * @author tian.gao
 * @create 2019.01.02 10:32 PM
 **/
public class XmlReader {

    private static final String RETURN_0 = "return 0";
    private static final String RETURN_1 = "return 1";
    private static final String NEXT = "\n\t";
    private String xmlFilename;
    private String aadlFilename;
    private String jsonString;
    private static final String FILE_SEPARATOR = System.getProperty("file.separator");
    private static final String ABSOLUTE_FILE_PATH = FILE_SEPARATOR + "Users" + FILE_SEPARATOR + "sortinn" + FILE_SEPARATOR + "Desktop" + FILE_SEPARATOR;
    private static final String H = ".h";
    private static final String C = ".c";
    private XmlBean xmlBean;
    private JSONObject aadlPublic;

    public XmlReader(String xmlFilename, String aadlFilename) {
        this.xmlFilename = xmlFilename;
        this.aadlFilename = aadlFilename;
        this.xmlBean = new XmlBean();
        setJsonString(xmlFilename);
        aadlPublic = getAadlPublic();
    }

    public XmlReader(String xmlFilename) {
        this(xmlFilename, null);
    }


    private void setJsonString(String filename) {
        jsonString = parseXmlToJson(filename);
    }

    public static String parseXmlToJson(String xmlFilename) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(new File(xmlFilename)));
            BufferedReader br = new BufferedReader(reader);
            String readLine;
            while ((readLine = br.readLine()) != null) {
                sb.append(readLine);
            }
        } catch (IOException e) {
            System.out.println("read file error");
        }
        org.json.JSONObject jsonObject = XML.toJSONObject(sb.toString());
        return jsonObject.toString();
    }

    public void createCompleteHeaderFile() {
        String completeHeaderContent = "#include<stdio.h>\n#include<stdlib.h>\n\nint fun_control();";
        if (null == aadlPublic) {
            return;
        }
        String systemTypeName = getSystemName(aadlPublic);
        xmlBean.setSystemTypeName(systemTypeName);
        createFileAndWrite(systemTypeName, completeHeaderContent, H);
    }


    public void createCompleteCFile() {
        if (null == aadlPublic) {
            return;
        }
        String processSubcomponentName = aadlPublic.getObject("systemImpl", JSONObject.class).getObject("subcomponents", JSONObject.class).getObject("processSubcomponent", JSONObject.class).getString("name");
        String completeCContent = "#include<Complete.h>\n\nint main(int argc, char const *argv[]){" + NEXT + "process();\n\t" + RETURN_0 + ";\n}\n\n" + "int process(){" + NEXT + "fun_control();\n\t" + RETURN_0 + ";\n}\n\nint control(){" + NEXT + "fun_thread();\n}";
        createFileAndWrite(getSystemName(aadlPublic), completeCContent, C);
    }

    public void createControlHeaderFile() {
        String controlHeaderContent = "#include<Complete.h>\n\nint fun_control();";
        if (null == aadlPublic) {
            return;
        }
        String processTypeName = getProcessTypeName();
        xmlBean.setProcessTypeName(processTypeName);
        createFileAndWrite(processTypeName, controlHeaderContent, H);

    }

    private String getProcessTypeName() {
        return aadlPublic.getObject("processType", JSONObject.class).getString("name");
    }

    public void createControlCFile() {
        JSONObject aadlPublic = getAadlPublic();
        JSONArray threadSubcomponentArray = aadlPublic.getObject("processImpl", JSONObject.class).getObject("subcomponents", JSONObject.class).getJSONArray("threadSubcomponent");
        JSONObject scaleSpeedData = (JSONObject) threadSubcomponentArray.get(0);
        String scaleSpeedDataName = scaleSpeedData.getString("name");
        JSONObject speedControlLaws = (JSONObject) threadSubcomponentArray.get(1);
        String speedControlLawsName = speedControlLaws.getString("name");
        String controlCContent = "#include<control.h>\n\nint fun_control(){\n\tread_data();" + NEXT + "control_laws();" + NEXT + RETURN_1 + ";\n}";
        createFileAndWrite(getProcessTypeName(), controlCContent, C);
    }

    public void createThreadReadDataHeaderFile() {
        if (aadlPublic == null) {
            return;
        }
        String threadReadDataName = getThreadReadDataName();
        xmlBean.setThreadReadDataName(threadReadDataName);
        String threadReadDataHeaderContent = "#include<control.h>\n\nint " + threadReadDataName + "();";
        createFileAndWrite(threadReadDataName, threadReadDataHeaderContent, H);
    }

    public void createThreadControlLawsHeaderFile() {
        JSONObject aadlPublic = getAadlPublic();
        if (aadlPublic == null) {
            return;
        }
        String threadControlLawsName = getThreadControlLawsName();
        xmlBean.setThreadControlLawsName(threadControlLawsName);
        String threadReadControlLawsContent = "#include<control.h>\n\nint " + threadControlLawsName + "();";
        createFileAndWrite(threadControlLawsName, threadReadControlLawsContent, H);
    }

    public void createThreadReadDataCFile() {
        String threadReadDataName = getThreadReadDataName();
        String content = "#include<" + threadReadDataName + ".h>\n\nint " + threadReadDataName + "(){" + NEXT + "fun_" + threadReadDataName + "();" + NEXT + RETURN_1 + ";\n}";
        createFileAndWrite(threadReadDataName, content, C);
    }

    public void createThreadControlLawsCFile() {
        String threadControlLawsName = getThreadControlLawsName();
        String content = "#include<" + threadControlLawsName + ".h>\n\nint " + threadControlLawsName + "(){" + NEXT + "fun_" + threadControlLawsName + "();" + NEXT + RETURN_1 + ";\n}";
        createFileAndWrite(threadControlLawsName, content, C);
    }

    public void createZipFile() {

    }

    private String getThreadReadDataName() {
        JSONArray threadType = aadlPublic.getJSONArray("threadType");
        JSONObject threadReadData = (JSONObject) threadType.get(0);
        return threadReadData.getString("name");
    }

    private String getThreadControlLawsName() {
        JSONArray threadType = aadlPublic.getJSONArray("threadType");
        JSONObject threadControlLaws = (JSONObject) threadType.get(1);
        return threadControlLaws.getString("name");
    }

    private String getSystemName(JSONObject aadlPublic) {
        return aadlPublic.getObject("systemType", JSONObject.class).getString("name");
    }

    private JSONObject getAadlPublic() {
        if ("".equals(jsonString)) {
            return null;
        }
        final JSONObject jsonObject = JSONObject.parseObject(jsonString);
        final JSONObject core = jsonObject.getObject("core:AadlSpec", JSONObject.class);
        final JSONObject aadlPackage = core.getObject("aadlPackage", JSONObject.class);
        final JSONObject aadlPublic = aadlPackage.getObject("aadlPublic", JSONObject.class);
        return aadlPublic;
    }

    private void createFileAndWrite(String TypeName, String content, String fileType) {
        try {
            PrintWriter printWriter = new PrintWriter(ABSOLUTE_FILE_PATH + TypeName + fileType, "UTF-8");
            printWriter.append(content);
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found.");
        } catch (UnsupportedEncodingException e) {
            System.out.println("unsupported encoding.");
        }
    }

    public static void main(String[] args) {
        final String stringObjectMap = parseXmlToJson(ABSOLUTE_FILE_PATH + "test.xml");
        System.out.println(stringObjectMap);
    }
}
