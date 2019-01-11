package problems.leetcode.arrayAndstring;

import java.util.LinkedList;
import java.util.List;


/**
 * 未解决。。。
 */
public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();

        int[] freq = new int[256];
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i)]++;
        }

        int distance = p.length();

        int l = 0, r = -1;
        while (l < s.length() && r + 1 < s.length()) {

            if (freq[s.charAt(r + 1)] > 0) {
                freq[s.charAt(++r)]--;
                distance--;
            }

            else if(freq[s.charAt(r + 1)] == 0) {
                distance++;
            }

            if (distance == 0) {
                res.add(l);
            }



        }

        return res;
    }

    public static void main(String[] args) {
        FindAnagrams findAnagrams = new FindAnagrams();
        List<Integer> anagrams = findAnagrams.findAnagrams("cbaebabacd", "abc");
        for (Integer i :
                anagrams) {
            System.out.print(i + " ");
        }
    }
}
