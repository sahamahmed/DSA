public class Binary_Search_Simple {
    public static boolean binarySearch(int[] arr, int target) {
        int L = 0, R = arr.length - 1;
        while( L <= R ){
            int M = L + (R - L) / 2;
            if (arr[M] == target) {
                return true;
            } else if (arr[M] > target ){
                R = M - 1;
            } else {
                L = M + 1;
            }

        }
        return false;
    }

    public static int binarySearchConditional(boolean[] arr) {
        int L = 0, R = arr.length - 1;
        while( L < R ){
            int M = L + (R - L) / 2;
            if (arr[M]) {
                R = M;
            } else {
                L = M + 1;
            }

        }
        return L;
    }



    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        boolean[] arr2 = { false, false, false, false, true, true, true, true, true, true };
        int target = 12;
        boolean result = binarySearch(arr, target);
        System.out.println(result);
        int result2 = binarySearchConditional(arr2);
        System.out.println(result2);
    }
}
