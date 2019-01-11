package problems.leetcode.math;

public class MyPow {

    //n >= 0
    public double pow(double x, int n) {

        if (n == 0) {
            return 1.0;
        }
        double t = pow(x, n / 2);
        if (n % 2 != 0) {
            return x * t * t;
        }
        return t * t;

    }
}
