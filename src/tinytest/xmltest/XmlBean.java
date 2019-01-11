package tinytest.xmltest;

/**
 * @author tian.gao
 * @create 2019.01.03 9:00 PM
 **/
public class XmlBean {

    private String systemTypeName;

    private String processTypeName;

    private String threadReadDataName;

    public String getSystemTypeName() {
        return systemTypeName;
    }

    public void setSystemTypeName(String systemTypeName) {
        this.systemTypeName = systemTypeName;
    }

    public String getProcessTypeName() {
        return processTypeName;
    }

    public void setProcessTypeName(String processTypeName) {
        this.processTypeName = processTypeName;
    }

    public String getThreadReadDataName() {
        return threadReadDataName;
    }

    public void setThreadReadDataName(String threadReadDataName) {
        this.threadReadDataName = threadReadDataName;
    }

    public String getThreadControlLawsName() {
        return threadControlLawsName;
    }

    public void setThreadControlLawsName(String threadControlLawsName) {
        this.threadControlLawsName = threadControlLawsName;
    }

    private String threadControlLawsName;


}
