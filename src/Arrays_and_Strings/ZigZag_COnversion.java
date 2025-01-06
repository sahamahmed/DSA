package Arrays_and_Strings;

public class ZigZag_COnversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;
        StringBuilder[] rows = new StringBuilder[(numRows)];
        for (int i = 0; i < rows.length ; i++) {
            rows[i] = new StringBuilder();
        }
        boolean goingDown = false;
        int currentRow = 0;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            if( currentRow == 0 || currentRow == numRows - 1 ) goingDown = !goingDown;
            if ( goingDown ) {
                currentRow += 1;
            } else {
                currentRow -= 1;
            }
        }

        StringBuilder result = new StringBuilder();
        for ( StringBuilder row : rows ) {
            result.append( row );
        }

        return result.toString();
    }

}
