package problems.tinytest.jsontest;

import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.*;

/**
 * @author tian.gao
 * @create 2018.12.29 11:44 AM
 **/
public class JsonInfoFilter {



    public static void main(String[] args) {
        final String ORDER_BASE_INFO = "orderDetail.orderBaseInfo";
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(new File("/Users/sortinn/Downloads/orderInfo175.txt")));
            BufferedReader br = new BufferedReader(reader);
            String readLine;
            while ((readLine = br.readLine()) != null) {
                sb.append(readLine);
            }
        } catch (IOException e) {
            System.out.println("read file error");
        }
        String orderInfos = sb.toString();
        String[] orderInfoArr = orderInfos.split("orderDetailInfo:");
        LinkedList<String> orderInfoList = new LinkedList<>(Arrays.asList(orderInfoArr));
        Iterator<String> iterator = orderInfoList.iterator();
        for (; iterator.hasNext(); ) {
            String next = iterator.next();
            if (!next.contains("dataInfo")) {
                iterator.remove();
            }
        }
        System.out.println(orderInfoList.size());
        TreeSet<String> result = new TreeSet<>();
        for (String item : orderInfoList) {
            JSONObject object = JSONObject.parseObject(item);
            JSONObject orderBaseInfo = object.getObject("orderBaseInfo", JSONObject.class);
            Integer bizType = orderBaseInfo.getInteger("bizType");
            Integer orderStatus = orderBaseInfo.getInteger("orderStatus");
            Integer flightDateStatus = orderBaseInfo.getInteger("flightDateStatus");
            Boolean lastTicketTime = orderBaseInfo.getBoolean("lastTicketTime");

            result.add(ORDER_BASE_INFO + ".flightDateStatus in [" + flightDateStatus + "] " + " && " + ORDER_BASE_INFO + ".bizType == " + bizType + " && " + ORDER_BASE_INFO + ".orderStatus in [" + orderStatus + "]" + " && " + ORDER_BASE_INFO + ".lastTicketTime == " + lastTicketTime);
        }

        Iterator<String> iteratorSet = result.iterator();

        while (iteratorSet.hasNext()) {
            String next = iteratorSet.next();
            System.out.println(next);
        }
    }
}
