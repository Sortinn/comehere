package comehere.problems.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tian.gao
 * @create 2019.01.28 10:04 PM
 * @leetcode 728. Self Dividing Numbers
 **/
public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left; i <= right; i++){
            int now = i;
            while(now != 0){
                int tail = now % 10;
                if(tail == 0 || i % tail != 0) break;
                now /= 10;
            }
            if(now == 0){
                res.add(i);
            }
        }
        return res;
    }
}
