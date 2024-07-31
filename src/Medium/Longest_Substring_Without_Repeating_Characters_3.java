package Medium;

import java.util.HashSet;

/**
    Given a string s, find the length of the longest
    substring without repeating characters.
    @author doganalpppp
    @Date 31.07.2024
 **/

public class Longest_Substring_Without_Repeating_Characters_3 {
    public int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int maxLength = 0;
        HashSet<Character> hash_set = new HashSet();

        while (b_pointer < s.length()) {
            if (!hash_set.contains(s.charAt(b_pointer))) {
                hash_set.add(s.charAt(b_pointer));
                maxLength = Math.max(hash_set.size(), maxLength);
                b_pointer++;
            } else {
                hash_set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return maxLength;
    }

}
