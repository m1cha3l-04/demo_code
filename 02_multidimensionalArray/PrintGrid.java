public class PrintGrid {
    public static void main(String[] args) {
        int[][] tbl = {{1, 2, 3}, {4, 5, 6}, {7,8,9}};
        for (int r = 0; r < tbl.length; r++) {            // rows
            for (int c = 0; c < tbl[r].length; c++) {     // columns in this row
                System.out.print(tbl[r][c] + " ");        // stay on the same line
            }
            System.out.println();                       // then start a new line
        }
    }
}