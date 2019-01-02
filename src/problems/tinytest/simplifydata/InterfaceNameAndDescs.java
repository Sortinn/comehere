package problems.tinytest.simplifydata;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author tian.gao
 * @create 2018.12.20 6:06 PM
 **/
public class InterfaceNameAndDescs {

    public static void main(String[] args) {
        String input = "f_qosm,f_qosm,是否为vip用户\n" +
                "f_qosm,f_qosm,是否邮寄行程单\n" +
                "f_qosm,f_qosm,国际TTS最晚出票时间\n" +
                "f_qosm,f_qosm,国内最晚出票时间\n" +
                "f_qosm,f_qosm,航变信息\n" +
                "f_qosm,f_qosm,国际NTS最晚出票时间\n" +
                "f_qosm,f_qosm,客票状态\n" +
                "f_qosm,f_qosm,航班延误时间状态\n" +
                "f_qosm,f_qosm,延误险保单\n" +
                "f_qosm,f_qosm,订单详情(订单中心数据)\n" +
                "f_qosm,f_qosm,国内退改签规则\n" +
                "f_qosm,f_qosm,航司信息\n" +
                "f_qosm,f_qosm,是否索要行程单接口\n" +
                "f_qosm,f_qosm,获取改签状态接口\n" +
                "f_qosm,f_qosm,订单情景接口（qosm本身的Dubbo接口）\n" +
                "f_qosm,f_qosm,查询航变信息\n" +
                "f_qosm,f_qosm,国内行李额\n" +
                "f_qosm,f_qosm,国际NDC行李餐食信息\n" +
                "f_qosm,f_qosm,国际订单详情行李信息\n" +
                "f_qosm,f_qosm,国际服务号\n" +
                "f_qosm,f_qosm,航司相关-国内\n" +
                "f_qosm,f_qosm,航司相关-国际\n" +
                "f_qosm,f_qosm,用户标识\n" +
                "f_qosm,f_qosm,快递信息\n" +
                "f_qosm,f_qosm,国内退票\n" +
                "f_qosm,f_qosm,国内在线值机信息\n" +
                "f_qosm,f_qosm,出票超时\n" +
                "f_qosm,f_qosm,合并邮寄\n" +
                "f_qosm,f_qosm,国内乘机人信息\n" +
                "f_qosm,f_qosm,预计改签完成时间\n" +
                "f_qosm,f_qosm,退款详情\n" +
                "f_qosm,f_qosm,出票中超过15分钟\n" +
                "f_qosm,f_qosm,X产品\n" +
                "f_qosm,f_qosm,国内改签\n" +
                "f_qosm,f_qosm,航司相关-国际\n" +
                "f_qosm,f_qosm,行程单产品\n" +
                "f_qosm,f_qosm,快递产品\n" +
                "f_qosm,f_qosm,合并邮寄\n" +
                "f_qosm,f_qosm,国际退改签\n" +
                "f_qosm,f_qosm,国际索要报销凭证";


        StringBuilder formatInput = new StringBuilder();

        String[] splitInput = input.split(",");

        for (int i = 0; i < splitInput.length; i++) {
            if (!splitInput[i].equals("f_qosm")) {
                formatInput.append(splitInput[i]);
            }

        }
        System.out.println(formatInput.toString());
    }
}
