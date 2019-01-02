package problems.disksorting;

import java.io.*;
import java.util.Random;

public class FillDiskFiles {

    static int min;
    static int max;
    private static int sum;


     private static void fillDiskFile(File file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < sum; i++) {

                bw.write(Integer.toString(generateRandomNumber()));
                bw.newLine();

            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.println("输入随机数的范围和个数，用空格分开");
        line = br.readLine();
        br.close();
        String[] split = line.split(" ");
        FillDiskFiles.min = Integer.parseInt(split[0]);
        FillDiskFiles.max = Integer.parseInt(split[1]);
        FillDiskFiles.sum = Integer.parseInt(split[2]);

        System.out.println("随机数写入中...");
        FillDiskFiles.fillDiskFile(new File(InternalSortingInfo.dataPath));
        System.out.println("随机数写入完毕...");

        long start = System.currentTimeMillis();
        InternalSortingInfo info = new InternalSortingInfo();
        System.out.println("排序中...");
        InternalSortingInfo.setDataArray(new File(InternalSortingInfo.dataPath));
        System.out.println("排序结果写入中...");
        InternalSortingInfo.printResult(new File(InternalSortingInfo.dataSortedPath));
        System.out.println("排序结果写入完成...");
        long end = System.currentTimeMillis();
        long timeUsed = (end - start) / 1000;
        System.out.println("排序用时 " + timeUsed + " s" );
    }

}
