package problems.sum;

public class NatureNumberSum {
  public int sum(int n) {
    if (n == 1) {
      return 1;
    }
    if (n < 1) {
      return -1;
    }
    return sum(n - 1) + n;
  }

  public static void main(String[] args) {
    NatureNumberSum natureNumberSum = new NatureNumberSum();
    System.out.println(natureNumberSum.sum(50));
    System.out.println(natureNumberSum.sum(0));
    System.out.println(natureNumberSum.sum(1));
  }
}
