package comehere.problems.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author tian.gao
 * @create 2019.01.19 10:03 PM
 * @leetcode 929. Unique Email Addresses
 **/
public class UniqueEmailAddress {

    public static Set<String> numUniqueEmails(String[] emails) {
        Set<String> normalized = new HashSet<>(); // used to save simplified email address, cost O(n) sapce.
        for (String email : emails) {
            String[] parts = email.split("@"); // split into local and domain parts.
            String[] local = parts[0].split("\\+"); // split local by '+'.
            normalized.add(local[0].replace(".", "") + "@" + parts[1]); // remove all '.', and concatenate '@' and domain.
        }
        return normalized;
    }

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(UniqueEmailAddress.numUniqueEmails(emails));
    }

}
