public class Totals {
    public static void main(String[] args) {
        int[][] t = {{2, 4, 6}, {1, 3, 5}, {7, 8, 9}};

        for (int r = 0; r < t.length; r++) {            // row totals
            int rowSum = 0;                             // restart for every row
            for (int c = 0; c < t[r].length; c++) {
                rowSum = rowSum + t[r][c];
            }
            System.out.println("Row " + r + " total: " + rowSum);
        }

        for (int c = 0; c < t[0].length; c++) {         // column totals
            int colSum = 0;                             // restart each column
            for (int r = 0; r < t.length; r++) {        // loops are swapped
                colSum = colSum + t[r][c];
            }
            System.out.println("Column " + c + " total: " + colSum);
        }
    }
}