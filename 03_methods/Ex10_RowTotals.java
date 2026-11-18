public class Ex10_RowTotals {
    public static int rowSum(int[][] t, int row) {
        int sum = 0;
        for (int c = 0; c < t[row].length; c++) {
            sum += t[row][c];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] scores = {{85, 90, 78}, {70, 88, 92}};
        for (int r = 0; r < scores.length; r++) {
            System.out.println("Student " + (r + 1) + ": " + rowSum(scores, r));
        }
    }
}