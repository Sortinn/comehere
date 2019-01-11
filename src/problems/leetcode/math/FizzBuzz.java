package problems.leetcode.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<String> res = new ArrayList<>();

    public List<String> fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {

            String base = "";

            if (i % 3 == 0) {
                base += "Fizz";
            }

            if (i % 5 == 0) {
                base += "Buzz";
            }

            if (i % 3 != 0 && i % 5 != 0) {
                base += i;
            }

            res.add(base);
        }
        return res;
    }
}
