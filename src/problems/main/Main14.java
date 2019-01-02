package problems.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    String line = bf.readLine();
    String[] strings = line.split(" ");
    int[] woofs = new int[n];
    for (int i = 0; i < n; i++) {
      woofs[i] = Integer.parseInt(strings[i]);
    }
    System.out.println(res(n, woofs));
  }

  private static int res(int n, int[] woofs) {

    return -1;
  }
}
