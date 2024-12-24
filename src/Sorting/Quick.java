package Sorting;

import java.util.Arrays;

public class Quick {

    static void quick_sort(int[] arr, int start, int end) {
        if (end <= start) return ;
        int pivot = partition(arr, start, end);

        quick_sort(arr, start, pivot - 1);
        quick_sort(arr, pivot, end);

    }

    static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int i = start -1;
        for(int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {-5, 3, 2, 1, -3 , -3, 7, 3, 2};

        quick_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
