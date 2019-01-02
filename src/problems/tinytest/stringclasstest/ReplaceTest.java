package problems.tinytest.stringclasstest;

/**
 * @author tian.gao
 * @create 2018.12.26 9:49 AM
 **/
public class ReplaceTest {

    public static void main(String[] args) {
        String content = "【航班取消通知】尊敬的旅客，很抱歉的通知您，您在去哪儿网购买的@{depDate}@{dptAirPort}到@{arrAirPort}的@{flightNo}航班已取消。如需进入去哪儿网官方APP操作退改，请@{urlContent}";
        String afterReplace = content.replace("@{", "${");
        System.out.println(afterReplace);

    }
}
