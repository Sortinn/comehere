package problems.leetcode.setAndmap;

import java.util.*;

public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                Integer value = map.get(nums1[i]);
                map.put(nums1[i], ++value);
            } else {
                map.put(nums1[i], 1);
            }
        }

        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                res.add(nums2[i]);
                Integer value = map.get(nums2[i]);
                map.put(nums2[i], --value);
            }
        }

        Integer[] resInteger = res.toArray(new Integer[]{});
        int[] resInt = new int[resInteger.length];
        for (int i = 0; i < resInteger.length; i++) {
            resInt[i] = resInteger[i];
        }
        return resInt;
    }

    public static void main(String[] args) {
        Intersect intersect = new Intersect();
        int[] res = intersect.intersect(new int[]{1}, new int[]{});
        for (int aRes :
                res) {
            System.out.print(aRes + " ");
        }

    }
}

