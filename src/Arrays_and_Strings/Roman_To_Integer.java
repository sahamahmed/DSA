package Arrays_and_Strings;

import java.util.HashMap;
import java.util.Map;

public class Roman_To_Integer {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;
        int i = 0;
        while ( i < s.length() ) {
            if ( i < s.length() - 1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                sum += romanMap.get(s.charAt(i + 1)) - romanMap.get(s.charAt(i));
                i += 2;
            } else {
                sum += romanMap.get(s.charAt(i));
                i++;
            }
        }

        return sum;
    }
}
