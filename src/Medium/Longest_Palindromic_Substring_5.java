package Medium;

/**
    Given a string s, return the longest palindromic substring in s.
     @author doganalpppp
     @Date 31.07.2024
 **/
public class Longest_Palindromic_Substring_5 {
    public String longestPalindrome(String s) {
        if(s.equals(new StringBuilder(s).reverse().toString())){
            return s;
        }
        System.out.println(s);
        String left = longestPalindrome(s.substring(1));
        String right = longestPalindrome(s.substring(0,s.length()-1));

        return left.length()>right.length() ? left : right;
    }

    public static void main(String[] args) {
        Longest_Palindromic_Substring_5 obj = new Longest_Palindromic_Substring_5();
        System.out.println(obj.longestPalindrome("babad"));
    }

}
