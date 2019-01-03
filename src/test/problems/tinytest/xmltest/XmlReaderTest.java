package test.problems.tinytest.xmltest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import problems.tinytest.xmltest.XmlReader;

/**
 * XmlReader Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jan 3, 2019</pre>
 */
public class XmlReaderTest {

    private static XmlReader xmlReader;

    @Before
    public void before() throws Exception {
        xmlReader = new XmlReader("/Users/sortinn/Desktop/test.xml");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: parseXmlToJson(String xmlFilename)
     */
    @Test
    public void testParseXmlToJson() throws Exception {
        String expect = "{\"core:AadlSpec\":{\"xmlns:property\":\"http:///AADL/property\",\"xmi:version\":2,\"xmlns:core\":\"http:///AADL/core\",\"name\":\"TEST\",\"xmlns:xsi\":\"http://www.w3.org/2001/XMLSchema-instance\",\"xmlns:xmi\":\"http://www.omg.org/XMI\",\"aadlPackage\":{\"name\":\"TEST\",\"aadlPublic\":{\"deviceType\":[{\"features\":{\"busAccess\":{\"busClassifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/busImpl[@name=Marine.Standard]\",\"name\":\"BA1\",\"direction\":\"required\"},\"eventPort\":{\"name\":\"disengage\",\"direction\":\"out\"},\"dataPort\":{\"name\":\"set_speed\",\"direction\":\"out\"}},\"name\":\"interface\"},{\"features\":{\"busAccess\":{\"busClassifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/busImpl[@name=Marine.Standard]\",\"name\":\"BA1\",\"direction\":\"required\"},\"dataPort\":{\"name\":\"sensor_data\",\"direction\":\"out\"}},\"name\":\"sensor\"},{\"features\":{\"busAccess\":{\"busClassifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/busImpl[@name=Marine.Standard]\",\"name\":\"BA1\",\"direction\":\"required\"},\"dataPort\":{\"name\":\"cmd\"}},\"name\":\"actuator\"}],\"busImpl\":{\"compType\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/busType[@name=Marine]\",\"name\":\"Marine.Standard\"},\"processImpl\":{\"compType\":\"control\",\"name\":\"control.speed\",\"subcomponents\":{\"threadSubcomponent\":[{\"name\":\"scale_speed_data\",\"classifier\":\"read_data.speed\"},{\"name\":\"speed_control_laws\",\"classifier\":\"control_laws.speed\"}]},\"connections\":{\"eventConnection\":{\"srcContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processImpl[@name=control.speed]\",\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/threadType[@name=control_laws]/features/eventPort[@name=disengage]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processType[@name=control]/features/eventPort[@name=disengage]\",\"name\":\"EC1\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processImpl[@name=control.speed]/subcomponents/threadSubcomponent[@name=speed_control_laws]\"},\"dataConnection\":[{\"srcContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processImpl[@name=control.speed]\",\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/threadType[@name=read_data]/features/dataPort[@name=sensor_data]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processType[@name=control]/features/dataPort[@name=sensor_data]\",\"name\":\"DC1\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processImpl[@name=control.speed]/subcomponents/threadSubcomponent[@name=scale_speed_data]\"},{\"srcContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processImpl[@name=control.speed]/subcomponents/threadSubcomponent[@name=scale_speed_data]\",\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/threadType[@name=control_laws]/features/dataPort[@name=proc_data]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/threadType[@name=read_data]/features/dataPort[@name=proc_data]\",\"name\":\"DC2\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processImpl[@name=control.speed]/subcomponents/threadSubcomponent[@name=speed_control_laws]\"},{\"srcContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processImpl[@name=control.speed]/subcomponents/threadSubcomponent[@name=speed_control_laws]\",\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processType[@name=control]/features/dataPort[@name=command_data]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/threadType[@name=control_laws]/features/dataPort[@name=cmd]\",\"name\":\"DC3\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processImpl[@name=control.speed]\"},{\"srcContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processImpl[@name=control.speed]\",\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/threadType[@name=control_laws]/features/dataPort[@name=set_speed]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processType[@name=control]/features/dataPort[@name=set_speed]\",\"name\":\"DC4\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processImpl[@name=control.speed]/subcomponents/threadSubcomponent[@name=speed_control_laws]\"}]}},\"systemImpl\":{\"compType\":\"Complete\",\"name\":\"Complete.PBA_speed_control\",\"subcomponents\":{\"memorySubcomponent\":{\"name\":\"Stand_Memory\",\"classifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/memoryImpl[@name=RAM.Standard]\"},\"processSubcomponent\":{\"name\":\"speed_control\",\"classifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processImpl[@name=control.speed]\"},\"deviceSubcomponent\":[{\"name\":\"speed_sensor\",\"classifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceImpl[@name=sensor.speed]\"},{\"name\":\"throttle\",\"classifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceImpl[@name=actuator.speed]\"},{\"name\":\"interface_unit\",\"classifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceImpl[@name=interface.pilot]\"}],\"processorSubcomponent\":{\"name\":\"RT_1GHz\",\"classifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processorImpl[@name=Real_Time.one_GHz]\"},\"busSubcomponent\":{\"name\":\"Standard_Marine_Bus\",\"classifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/busImpl[@name=Marine.Standard]\"}},\"connections\":{\"eventConnection\":{\"srcContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/deviceSubcomponent[@name=interface_unit]\",\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processType[@name=control]/features/eventPort[@name=disengage]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceType[@name=interface]/features/eventPort[@name=disengage]\",\"name\":\"EC4\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/processSubcomponent[@name=speed_control]\"},\"busAccessConnection\":[{\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceType[@name=sensor]/features/busAccess[@name=BA1]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/busSubcomponent[@name=Standard_Marine_Bus]\",\"name\":\"BAC1\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/deviceSubcomponent[@name=speed_sensor]\"},{\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processorType[@name=Real_Time]/features/busAccess[@name=BA1]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/busSubcomponent[@name=Standard_Marine_Bus]\",\"name\":\"BAC2\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/processorSubcomponent[@name=RT_1GHz]\"},{\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceType[@name=actuator]/features/busAccess[@name=BA1]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/busSubcomponent[@name=Standard_Marine_Bus]\",\"name\":\"BAC3\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/deviceSubcomponent[@name=throttle]\"},{\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceType[@name=interface]/features/busAccess[@name=BA1]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/busSubcomponent[@name=Standard_Marine_Bus]\",\"name\":\"BAC4\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/deviceSubcomponent[@name=interface_unit]\"},{\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/memoryType[@name=RAM]/features/busAccess[@name=BA1]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/busSubcomponent[@name=Standard_Marine_Bus]\",\"name\":\"BAC5\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/memorySubcomponent[@name=Stand_Memory]\"}],\"dataConnection\":[{\"srcContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/deviceSubcomponent[@name=speed_sensor]\",\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processType[@name=control]/features/dataPort[@name=sensor_data]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceType[@name=sensor]/features/dataPort[@name=sensor_data]\",\"name\":\"DC1\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/processSubcomponent[@name=speed_control]\"},{\"srcContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/processSubcomponent[@name=speed_control]\",\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceType[@name=actuator]/features/dataPort[@name=cmd]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processType[@name=control]/features/dataPort[@name=command_data]\",\"name\":\"DC2\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/deviceSubcomponent[@name=throttle]\"},{\"srcContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/deviceSubcomponent[@name=interface_unit]\",\"dst\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processType[@name=control]/features/dataPort[@name=set_speed]\",\"src\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceType[@name=interface]/features/dataPort[@name=set_speed]\",\"name\":\"DC3\",\"dstContext\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/systemImpl[@name=Complete.PBA_speed_control]/subcomponents/processSubcomponent[@name=speed_control]\"}]}},\"processorType\":{\"features\":{\"busAccess\":{\"busClassifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/busImpl[@name=Marine.Standard]\",\"name\":\"BA1\",\"direction\":\"required\"}},\"name\":\"Real_Time\"},\"memoryType\":{\"features\":{\"busAccess\":{\"busClassifier\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/busImpl[@name=Marine.Standard]\",\"name\":\"BA1\",\"direction\":\"required\"}},\"name\":\"RAM\"},\"memoryImpl\":{\"compType\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/memoryType[@name=RAM]\",\"name\":\"RAM.Standard\"},\"threadImpl\":[{\"compType\":\"read_data\",\"name\":\"read_data.speed\"},{\"compType\":\"control_laws\",\"name\":\"control_laws.speed\"}],\"processorImpl\":{\"compType\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/processorType[@name=Real_Time]\",\"name\":\"Real_Time.one_GHz\"},\"systemType\":{\"name\":\"Complete\"},\"threadType\":[{\"features\":{\"dataPort\":[{\"name\":\"sensor_data\"},{\"name\":\"proc_data\",\"direction\":\"out\"}]},\"name\":\"read_data\",\"properties\":{\"propertyAssociation\":[{\"propertyDefinition\":\"/aadlSpec[@name=AADL_Properties]/propertySet[@name=AADL_Properties]/propertyDefinition[@name=Dispatch_Protocol]\",\"propertyValue\":{\"enumLiteral\":\"/aadlSpec[@name=AADL_Project]/propertySet[@name=AADL_Project]/propertyType[@name=Supported_Dispatch_Protocols]/enumLiteral[@name=Periodic]\",\"xsi:type\":\"property:EnumValue\"}},{\"propertyDefinition\":\"/aadlSpec[@name=AADL_Properties]/propertySet[@name=AADL_Properties]/propertyDefinition[@name=Period]\",\"propertyValue\":{\"valueString\":50,\"xsi:type\":\"property:IntegerValue\",\"unitLiteral\":\"/aadlSpec[@name=AADL_Project]/propertySet[@name=AADL_Project]/propertyType[@name=Time_Units]/unitLiteral[@name=Ms]\",\"value\":50,\"base\":10}}]}},{\"features\":{\"eventPort\":{\"name\":\"disengage\"},\"dataPort\":[{\"name\":\"proc_data\"},{\"name\":\"cmd\",\"direction\":\"out\"},{\"name\":\"set_speed\"}]},\"name\":\"control_laws\",\"properties\":{\"propertyAssociation\":[{\"propertyDefinition\":\"/aadlSpec[@name=AADL_Properties]/propertySet[@name=AADL_Properties]/propertyDefinition[@name=Dispatch_Protocol]\",\"propertyValue\":{\"enumLiteral\":\"/aadlSpec[@name=AADL_Project]/propertySet[@name=AADL_Project]/propertyType[@name=Supported_Dispatch_Protocols]/enumLiteral[@name=Periodic]\",\"xsi:type\":\"property:EnumValue\"}},{\"propertyDefinition\":\"/aadlSpec[@name=AADL_Properties]/propertySet[@name=AADL_Properties]/propertyDefinition[@name=Period]\",\"propertyValue\":{\"valueString\":50,\"xsi:type\":\"property:IntegerValue\",\"unitLiteral\":\"/aadlSpec[@name=AADL_Project]/propertySet[@name=AADL_Project]/propertyType[@name=Time_Units]/unitLiteral[@name=Ms]\",\"value\":50,\"base\":10}}]}}],\"processType\":{\"features\":{\"eventPort\":{\"name\":\"disengage\"},\"dataPort\":[{\"name\":\"sensor_data\"},{\"name\":\"command_data\",\"direction\":\"out\"},{\"name\":\"set_speed\"}]},\"name\":\"control\"},\"busType\":{\"name\":\"Marine\"},\"deviceImpl\":[{\"compType\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceType[@name=interface]\",\"name\":\"interface.pilot\"},{\"compType\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceType[@name=sensor]\",\"name\":\"sensor.speed\"},{\"compType\":\"/aadlSpec[@name=TEST]/aadlPackage[@name=TEST]/aadlPublic/deviceType[@name=actuator]\",\"name\":\"actuator.speed\"}]}}}}";
        Assert.assertEquals(expect, XmlReader.parseXmlToJson("/Users/sortinn/Desktop/test.xml"));
    }

    /**
     * Method: createCompleteHeaderFile()
     */
    @Test
    public void testCreateCompleteHeaderFile() throws Exception {
        String expect = "Complete";
        //Assert.assertEquals(expect, xmlReader.createCompleteHeaderFile());
        xmlReader.createCompleteHeaderFile();
    }

    /**
     * Method: createCompleteCFile()
     */
    @Test
    public void testCreateCompleteCFile() throws Exception {
        xmlReader.createCompleteCFile();
    }

    /**
     * Method: createControlHeaderFile()
     */
    @Test
    public void testCreateControlHeaderFile() throws Exception {
        xmlReader.createControlHeaderFile();
    }

    /**
     * Method: createControlCFile()
     */
    @Test
    public void testCreateControlCFile() throws Exception {
        xmlReader.createControlCFile();
    }

    /**
     * Method: createThread1HeaderFile()
     */
    @Test
    public void testCreateThreadHeaderFile() throws Exception {
        xmlReader.createThreadReadDataHeaderFile();
    }

    /**
     * Method: createThread1CFile()
     */
    @Test
    public void testCreateThread1CFile() throws Exception {
        xmlReader.createThreadReadDataCFile();
    }

    /**
     * Method: createThread2HeaderFile()
     */
    @Test
    public void testCreateThread2HeaderFile() throws Exception {
        xmlReader.createThreadControlLawsHeaderFile();
    }

    /**
     * Method: createThread2CFile()
     */
    @Test
    public void testCreateThread2CFile() throws Exception {
        xmlReader.createThreadControlLawsCFile();
    }

    /**
     * Method: createZipFile()
     */
    @Test
    public void testCreateZipFile() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {
//TODO: Test goes here... 
    }


    /**
     * Method: setJsonString(String filename)
     */
    @Test
    public void testSetJsonString() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = XmlReader.getClass().getMethod("setJsonString", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
