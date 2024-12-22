package Sorting;

import java.io.Console;
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 50 , -10 , 20 , -20 , 100 , 80 };
        int N = arr.length - 1;
        boolean flag = true;

        while (flag) {
            flag = false;
            for ( int i = 1 ; i <= N ; i++ ) {
                if ( arr[i] < arr[i - 1]) {
                    flag = true;
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
