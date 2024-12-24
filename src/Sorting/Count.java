package Sorting;

import java.util.Arrays;

public class Count {
    static int[] count_sort(int[] input_arr) {
        int N = input_arr.length;
        int maxx = 0;
        for (int i = 0; i < N; i++) {
            maxx = Math.max(maxx, input_arr[i]);
        }

        int[] count_arr = new int[maxx + 1];

        for (int i = 0; i < N ; i++) {
            count_arr[input_arr[i]]++;
        }
        for (int i = 1; i <= maxx; i++ ) {
            count_arr[i] = count_arr[i] + count_arr[i - 1];
        }

        int[] output_arr = new int[N];
        for (int i = 0; i < N; i++) {
            output_arr[count_arr[input_arr[i]] - 1] = input_arr[i];
            count_arr[input_arr[i]]--;
        }

        return output_arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 3 };

        int[] output_arr = count_sort(arr);
        System.out.println(Arrays.toString(output_arr));

    }
}
