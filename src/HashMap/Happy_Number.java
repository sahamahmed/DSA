package HashMap;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while ( !set.contains(n) ) {
            set.add(n);
            n = getSum(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    public static int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
