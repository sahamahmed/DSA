package Arrays_and_Strings;

import java.util.Arrays;

public class Rotate_Array {
    public int[] reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }
    public  void main(String[] args) {
        int[] arr= {-1,-100,3,99};
        int k = 2;

        arr = reverse(arr,0, arr.length -1);

        arr = reverse(arr,0,k - 1);

        arr = reverse(arr,k,arr.length -1);

        System.out.println(Arrays.toString(arr));

    }
}
