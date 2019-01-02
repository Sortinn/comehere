package problems.tinytest.hashmaptest;

import com.google.common.collect.Maps;
import qunar.api.pojo.node.JacksonSupport;
import qunar.api.pojo.node.NullNode;
import qunar.api.pojo.node.ValueNode;

import java.util.Map;

/**
 * @author tian.gao
 * @create 2018.12.19 6:03 PM
 **/
public class HashMapResizeTest {

    private static final String ANSWER = "answer";
    private static final String LABEL_ID = "labelId";
    private static final String MIND_CODE = "mindCode";
    private static final String RECOMMEND_MODULE = "recommendModule";


    public static void main(String[] args) {
        Map<String, String> answerMap = Maps.newHashMapWithExpectedSize(3);

        String answer = "";
        String labelId = "";
        String mindCode = "";
        String recommendModule = "";

        String doPost = "{\"id\":null,\"answer\":\"请您放心，您的机票会在2018-12-26 11:15:01时间前完成出票，去哪儿有监控部门随时监控您出票进度，保证您顺利出行，请您耐心等待出票哦~\",\"match\":true,\"message\":\"success\",\"question\":null,\"score\":null,\"extra\":{\"labelId\":7055,\"mindCode\":\"2112\",\"recommendModule\":\"dubbo_IAnswerInfoService\"}}";
        if (!"".equals(doPost)) {
            answer = JacksonSupport.parse(doPost).get(ANSWER).toString();
            ValueNode extra = JacksonSupport.parse(doPost).get("extra");
            if (!(extra instanceof NullNode)) {
                labelId = extra.get(LABEL_ID).toString();
                mindCode = extra.get(MIND_CODE).toString();
                recommendModule = extra.get(RECOMMEND_MODULE).toString();
            }
            answerMap.put("answer", answer);
            answerMap.put("LABEL_ID", labelId);
            answerMap.put("MIND_CODE", mindCode);
            answerMap.put("RECOMMEND_MODULE", recommendModule);

            System.out.println(answerMap);
        }
    }
}
