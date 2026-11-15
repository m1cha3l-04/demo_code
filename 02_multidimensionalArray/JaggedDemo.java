public class JaggedDemo {
    public static void main(String[] args) {
        int[][] teams = {{1, 2}, {3, 4, 5}, {6}, {7,8,9,10}};   // rows of different lengths
        for (int r = 0; r < teams.length; r++) {
            System.out.println("Row " + r + ": " + teams[r].length + " items");
        }
    }
}