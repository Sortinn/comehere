package guava.test.ordering;

import com.google.common.collect.Ordering;

import java.util.Arrays;
import java.util.List;

public class OrderingTest {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 4, 5, 3, 2, 3, 67, 53, 65, 99);
        System.out.println("original int list: " + intList);

        Ordering<Comparable> naturalOrdering = Ordering.natural().reverse();
        System.out.println("sorted int list: " + naturalOrdering.sortedCopy(intList));

        List<String> stringList = Arrays.asList("ad", "aa", "ab", "ccc");
        System.out.println("original string list: " + stringList);

        Ordering<Object> stringOrdering = Ordering.usingToString().nullsFirst();
        System.out.println("sorted string list: " + stringOrdering.sortedCopy(stringList));

        Ordering<String> ordering = new Ordering<String>() {
            @Override
            public int compare(String left, String right) {
                return (left.length() - right.length());
            }
        };

        System.out.println(ordering.sortedCopy(stringList));

    }
}
