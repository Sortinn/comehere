package problems.tinytest.xmltest;

import org.json.JSONObject;
import org.json.XML;

import java.io.*;
import java.util.Map;

/**
 * @author tian.gao
 * @create 2019.01.02 10:32 PM
 **/
public class XmlReader {

    public static Map<String, Object> parseXml(String filename) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(new File(filename)));
            BufferedReader br = new BufferedReader(reader);
            String readLine;
            while ((readLine = br.readLine()) != null) {
                sb.append(readLine);
            }
        } catch (IOException e) {
            System.out.println("read file error");
        }
        JSONObject jsonObject = XML.toJSONObject(sb.toString());
        return jsonObject.toMap();
    }

    public static void main(String[] args) {
        final Map<String, Object> stringObjectMap = parseXml("/Users/sortinn/Desktop/test.xml");
        System.out.println(stringObjectMap);
    }
}
