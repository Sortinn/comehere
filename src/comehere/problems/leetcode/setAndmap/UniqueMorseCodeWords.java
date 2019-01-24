package comehere.problems.leetcode.setAndmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @author tian.gao
 * @create 2019.01.24 8:46 PM
 * @leetcode 804. Unique Morse Code Words
 **/
public class UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> translations = new HashSet<>();
        for (String code : words) {
            StringBuilder sb = new StringBuilder();
            for (char single : code.toCharArray()) {
                int index = single - 'a';
                sb.append(morseCode[index]);
            }
            translations.add(sb.toString());
        }
        return translations.size();
    }
}
