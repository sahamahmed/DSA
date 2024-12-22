package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 50 , -10 , 20 , -20 , 100 , 80 };
        int N = arr.length - 1;
        for (int i = 0; i <= N; i++) {
            int index_with_min_value = i;
            for (int j = i + 1; j <= N; j++) {
                if (arr[j] < arr[index_with_min_value]) {
                    index_with_min_value = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index_with_min_value];
            arr[index_with_min_value] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
