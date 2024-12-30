package Arrays_and_Strings;

public class H_index {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        int n = citations.length;
        int[] count = new int[n+1];
        for (int i = 0; i < citations.length; i++) {
            if( citations[i] >= n ) {
                count[n]++;
            } else {
                count[citations[i]]++;
            }
        }
        int h = n;
        int paper_counts = count[n];
        while (paper_counts < h) {
            h--;
            paper_counts += count[h];
        }

        System.out.println(h);
    }
}
