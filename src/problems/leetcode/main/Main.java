package problems.leetcode.main;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//
//    private int n; // 城市数量
//    private int[][] distance; // 距离矩阵
//
//    private int[] colable;//代表列，也表示是否走过，走过置0
//    private int[] row;//代表行，选过置0
//
//
//    private void init() throws IOException {
//        // 读取数据
//        int[] x;
//        int[] y;
//        String[] strings = new String[0];
////        多组输入，存入字符串数组中
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = null;
//        while ((line = reader.readLine()) != null) {
//            n = Integer.parseInt(line);
//
//            //多组输入
//
//            strings = new String[n];
//            for (int i = 0; i < n; i++) {
//                strings[i] = reader.readLine();
//            }
//
//        }
//
//        distance = new int[n][n];
//        x = new int[n];
//        y = new int[n];
//        for (int i = 0; i < n; i++) {
//            // 字符分割
//            String[] strcol = strings[i].split(",");
//            x[i] = Integer.valueOf(strcol[0]);// x坐标
//            y[i] = Integer.valueOf(strcol[1]);// y坐标
//        }
//        reader.close();
//
//        // 计算距离矩阵
//        for (int i = 0; i < this.n - 1; i++) {
//            distance[i][i] = 0; // 对角线为0
//            for (int j = i + 1; j < this.n; j++) {
//                double rij = Math
//                        .sqrt(((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j])
//                                * (y[i] - y[j])) / 10.0);
//                // 四舍五入，取整
//                int tij = (int) Math.round(rij);
//                if (tij < rij) {
//                    distance[i][j] = tij + 1;
//                    distance[j][i] = distance[i][j];
//                } else {
//                    distance[i][j] = tij;
//                    distance[j][i] = distance[i][j];
//                }
//            }
//        }
//
//        distance[this.n - 1][this.n - 1] = 0;
//
//        colable = new int[this.n];
//        colable[0] = 0;
//        for (int i = 1; i < this.n; i++) {
//            colable[i] = 1;
//        }
//
//        row = new int[this.n];
//        for (int i = 0; i < this.n; i++) {
//            row[i] = 1;
//        }
//
//    }
//
//    public void solve() {
//
//        int[] temp = new int[n];
//        String path = "0";
//
//        int s = 0;//计算距离
//        int i = 0;//当前节点
//        int j = 0;//下一个节点
//        //默认从0开始
//        while (row[i] == 1) {
//            //复制一行
//            for (int k = 0; k < n; k++) {
//                temp[k] = distance[i][k];
//            }
//            //选择下一个节点，要求不是已经走过，并且与i不同
//            j = selectmin(temp);
//            //找出下一节点
//            row[i] = 0;//行置0，表示已经选过
//            colable[j] = 0;//列0，表示已经走过
//
//            s = s + distance[i][j];
//            i = j;//当前节点指向下一节点
//        }
//        System.out.println(s);
//
//    }
//
//    public int selectmin(int[] p) {
//        int j = 0, m = p[0], k = 0;
//        //寻找第一个可用节点，注意最后一次寻找，没有可用节点
//        while (colable[j] == 0) {
//            j++;
//            //System.out.print(j+" ");
//            if (j >= n) {
//                //没有可用节点，说明已结束，最后一次为 *-->0
//                m = p[0];
//                break;
//                //或者直接return 0;
//            } else {
//                m = p[j];
//            }
//        }
//        //从可用节点J开始往后扫描，找出距离最小节点
//        for (; j < n; j++) {
//            if (colable[j] == 1) {
//                if (m >= p[j]) {
//                    m = p[j];
//                    k = j;
//                }
//            }
//        }
//        return k;
//    }
//
//
//
//
//    public static void main(String[] args) throws IOException {
//        Main teststack = new Main();
//        teststack.init();
//        //teststack.printinit();
//        teststack.solve();
//    }
//}

import java.util.*;

public class Main {
    public List<Integer> max(int m, int n, List<List<Integer>> list) {
        List<List<Integer>> mylist = list;
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            newList.addAll(mylist.get(i));
        }
        int[] arr = new int[newList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newList.get(i);
        }
        Arrays.sort(arr);
        System.out.println();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + "");
        }
        System.out.println(sb);
        String str = sb.toString();
        for (int i = 0; i < n; i++) {
            int start = str.indexOf(mylist.get(0).get(i));
            int last = str.indexOf(mylist.get(0).get(i));
            int cnt = last - start + 1;
            if (cnt == m) {
                res.add(new Integer(mylist.get(0).get(i)));
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(perfectNumberCheck(28));

        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2, 5), Arrays.asList(2, 6, 7), Arrays.asList(2, 1, 0), Arrays.asList(2, 22, 222));

        System.out.println(new Main().max(4, 4, lists));
    }
}