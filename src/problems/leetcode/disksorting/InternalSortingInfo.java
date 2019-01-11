package problems.leetcode.disksorting;

import java.io.*;

public class InternalSortingInfo {
    private static int[] data;
    static String dataPath = "/Users/sortinn/sortinn/Java Project/Test/src/problems/solutions/disksorting/data.txt";
    static String dataSortedPath = "/Users/sortinn/sortinn/Java Project/Test/src/problems/solutions/disksorting/datasorted.txt";

    InternalSortingInfo() {
        int min = FillDiskFiles.min;
        int max = FillDiskFiles.max;
        data = new int[max + 1];
        for (int i = min; i <= max; i++) {
            data[i] = 0;
        }
    }

    static void setDataArray(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((br.readLine()) != null) {

                int i = Integer.parseInt(br.readLine());
                data[i] = 1;

            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printResult(File file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < data.length; i++) {
                if (data[i] == 1) {
                    bw.write(Integer.toString(i));
                    bw.newLine();
                }
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
