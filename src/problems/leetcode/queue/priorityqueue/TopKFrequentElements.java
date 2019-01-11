package problems.leetcode.queue.priorityqueue;

import java.util.*;

public class TopKFrequentElements {


    /**
     * 时间复杂度 O(nlogk)
     * @param nums
     * @param k
     * @return
     */
    public List<Integer> topKFrequent(int[] nums, int k) {

        class KeyAndValue {
            private int key;
            private int value;

            public KeyAndValue(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        Comparator<KeyAndValue> comparator = new Comparator<KeyAndValue>() {
            @Override
            public int compare(KeyAndValue o1, KeyAndValue o2) {
                return o1.value - o2.value;
            }
        };

        Map<Integer, Integer> map = new HashMap<>(10);

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<KeyAndValue> pq = new PriorityQueue<>(comparator);
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> aMap = iterator.next();
            if (pq.size() == k) {
                if (aMap.getValue() > pq.peek().value) {
                    pq.poll();
                    pq.add(new KeyAndValue(aMap.getKey(), aMap.getValue()));
                }
            } else {
                pq.add(new KeyAndValue(aMap.getKey(), aMap.getValue()));
            }
        }

        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll().key);
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> res = new TopKFrequentElements().topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}
