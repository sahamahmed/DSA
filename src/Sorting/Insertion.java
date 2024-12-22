package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = { 50 , -10 , 20 , -20 , 100 , 80 };
        int N = arr.length - 1;
        for(int i = 1; i <= N; i++){
            for( int j = i; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                } else break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
