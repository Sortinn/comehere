package tinytest;

import com.google.common.base.Splitter;
import comehere.problems.leetcode.stack.TwoStackQueue;

import java.util.Iterator;

public class ForTest {

    private TwoStackQueue twoStackQueue;


//    private static int num1;
//    private int num2;
//
//    public static void execute(int in1, int in2) {
//        if (in1 == 1) {
//            if (in2 == 2) {
//                System.out.println("input is right");
//                return;
//            }
//            System.out.println("I don't know whether or not I will be output.");
//        }
//        if (in1 == 1 && in2 != 3) {
//            System.out.println("input is wrong");
//        }
//        System.out.println("Whether or not I should output something...");
//
//        if (!(isTrue() && isFalse())) {
//            System.out.println("运算符结合原来如此");
//            System.out.println("先结合 ! 再结合&&");
//        }
//    }
//
//    public static void staticMethod() {
//
//    }
//
//    public static boolean isTrue() {
//        return true;
//    }
//
//    public static boolean isFalse() {
//        return false;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//        int a = Integer.parseInt(bufferedReader.readLine().trim().split(" ")[0]);
//        System.out.println(n);
//        System.out.println(a);


//        //多组输入，存入字符串数组中
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = null;
//        while ((line = reader.readLine()) != null) {
//            int n = Integer.parseInt(line);
//
//            //多组输入
//            String[] strings = new String[n];
//            for (int i = 0; i < n; i++) {
//                strings[i] = reader.readLine();
//            }
//
//            //单组输入
//            System.out.println();
//        }

//        System.out.println("char: " + Character.BYTES + "个字节");
//        System.out.println("int: " + Integer.BYTES + "个字节");
//        System.out.println("short: " + Short.BYTES + "个字节");
//        System.out.println("long: " + Long.BYTES + "个字节");
//        System.out.println("float: " + Float.BYTES + "个字节");
//        System.out.println("double: " + Double.BYTES + "个字节");


//
//     Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            int input1 = in.nextInt();
//            int input2 = in.nextInt();
//            ForTest.execute(input1, input2);
//            System.out.println("output is over...");
//        }


//        System.out.println(Runtime.getRuntime().availableProcessors());  //获取当前可用的CPU数


//        String str1 = "Hello";
//        String str2 = new String("Hello");
//        String str3 = "Hello";
//        String str4 = new String("Hello");
//
//        if (str1 == str2) {
//            System.out.println("str1、str2的地址相同");
//        } else {
//            System.out.println("str1和str2的地址不同");
//        }
//
//        if (str2.equals(str1)) {
//            System.out.println("str1 equals to str2");
//        } else {
//            System.out.println("str1 doesn't equals to str2");
//        }
//
//        if (str2 == str4) {
//            System.out.println("str2、str4的地址相同");
//        } else {
//            System.out.println("str2、str4的地址不同");
//
//        }


//        ListNode head = new ListNode(4);
//        ListNode t = head;
//        t.setNext(new ListNode(5));
//        System.out.println(head.getNext().getValue());


    //HashMap 并发性非线程安全，容易出现死循环

//        final HashMap<String, String> map = new HashMap<String, String>();
//        for (int i = 0; i < 1000; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    map.put(UUID.randomUUID().toString(), "");
//                    System.out.println("I'm running...");
//                }
//            }).start();
//        }
//        System.out.println("I stopped...");


//
//        //HashMap 强烈推荐的遍历方式
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "GT");
//        map.put(2, "LJ");
//        map.put(3, "CSH");
//        map.put(4, "ZZH");
//        map.put(5, "DXY");
//
//        Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
//        while (entryIterator.hasNext()) {
//            Map.Entry<Integer, String> aMap = entryIterator.next();
//            System.out.println("key:" + aMap.getKey() + " value:" + aMap.getValue());
//        }

//    }


    private static void test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] % 2 == 0) {
                    throw new NullPointerException();
                } else {
                    System.out.print(i);
                }
            } finally {
                System.out.print("e");
            }
        }
    }

    public void print(String input) {
        System.out.println("String input");
    }

    public void print(Object input) {
        System.out.println("Object input");
    }

    public static void main(String[] args) {
//        int cnt = 0;
//        int num = 0;
//        for (int i = 0; i < 100; i++) {
//            num += i;
//            cnt = cnt++;
//        }
//        System.out.println(num * cnt);
//        System.out.printf("%d",'d' - 'a' + 1);
//
//        try {
//            teststack(new int[] {0, 1, 2, 3, 4, 5});
//        } catch (Exception e) {
//            System.out.print("E");
//        }

//        new ForTest().print(null);
//
//        byte a = 10;
//        int b = -a;
//        System.out.println(b);
//        String str = new String("hello");
//        if (str == "hello") {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//        String s = "ab cd  e";
//        String[] split = s.split(" ");
//        for (int i = 0; i < split.length; i++) {
//            System.out.print(split[i] + "|");
//        }
//
//        System.out.println();
//        System.out.println(2 << 29);
//        System.out.println(2 << 30);
//        System.out.println((2 << 30) - 1);
//        System.out.println((2 << 31) - 1);
//        System.out.println(2 << 32);
//        System.out.println(2 << 33);
        String[] split = ",a,,b, ".split(",");
        Iterable<String> split1 = Splitter.on(",").trimResults().omitEmptyStrings().split("foo,bar,,   qux");
        Iterator<String> iterator = split1.iterator();
        System.out.print('[');
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.print(']');
    }




}
