package Easy;

import java.util.Collections;
import java.util.HashSet;

/**
     Given a roman numeral, convert it to an integer.
     @author doganalpppp
     @Date 01.08.2024
 **/
public class Roman_To_Integer_13 {
    public int romanToInt(String s) {
        int intVal = 0;
        HashSet<String> mySet = new HashSet<>();
        Collections.addAll(mySet, "CM", "CD", "XL", "XC", "IV", "IX");

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case('I'):
                    intVal++;
                    break;
                case('V'):
                    intVal = intVal + 5;
                    break;
                case('X'):
                    intVal = intVal + 10;
                    break;
                case('L'):
                    intVal = intVal + 50;
                    break;
                case('C'):
                    intVal = intVal + 100;
                    break;
                case('D'):
                    intVal = intVal + 500;
                    break;
                case('M'):
                    intVal = intVal + 1000;
                    break;
            }
        }

        for (String check: mySet) {
            if (s.contains(check)) {
                if (check == "CM" || check == "CD") {
                    intVal-=200;
                }
                else if (check == "XL" || check == "XC") {
                    intVal-=20;
                }
                else if (check == "IV" || check == "IX") {
                    intVal-=2;
                }
            }
        }

        return intVal;
    }

    public static void main(String[] args) {
        Roman_To_Integer_13 romanToInteger13 = new Roman_To_Integer_13();
        System.out.println(romanToInteger13.romanToInt("MCMXCIV"));
    }

}

