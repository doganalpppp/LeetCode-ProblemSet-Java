package Easy;

/**

     @author doganalpppp
     @Date 01.08.2024
 **/
public class Palindrome_Number_9 {
    public boolean isPalindrome(int x) {
        return (new StringBuilder(String.valueOf(x)).toString()).equals((new StringBuilder(String.valueOf(x)).reverse()).toString());
    }

}
