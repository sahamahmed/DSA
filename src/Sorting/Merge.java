package Sorting;

import java.util.Arrays;



public class Merge {
    public static int[] merge_sort(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr;

        int M = arr.length / 2;
        int[] L = Arrays.copyOfRange(arr, 0, M );
        int[] R = Arrays.copyOfRange(arr, M , arr.length);

        L = merge_sort(L);
        R = merge_sort(R);

        int l = 0;
        int r = 0;
        int length_L = L.length;
        int length_R = R.length;
        int i = 0;
        int[] sorted_array = new int[n];

        while(l < length_L && r < length_R ) {
            if (L[l] <= R[r] ) {
                sorted_array[i] = L[l];
                l++;
            } else {
                sorted_array[i] = R[r];
                r++;
            }
            i++;
        }

        while (l < length_L) {
            sorted_array[i] = L[l];
            i++;
            l++;
        }

        while (r < length_R) {
            sorted_array[i] = R[r];
            i++;
            r++;
        }

        return sorted_array;
    }

    public static void main(String[] args) {
        int[] arr = {-5, 3, 2, 1, -3 , -3, 7, 2, 2};
        int N = arr.length - 1;


        int[] result = merge_sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
