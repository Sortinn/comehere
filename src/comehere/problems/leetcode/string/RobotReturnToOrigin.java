package comehere.problems.leetcode.string;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author tian.gao
 * @create 2019.01.29 10:17 AM
 * @leetcode 657. Robot Return to Origin
 **/
public class RobotReturnToOrigin {

    //时间复杂度O(N)
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
