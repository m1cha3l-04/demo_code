public class BoundsDemo {
    public static void main(String[] args) {
        int[][] grid = new int[3][4];     // 3 rows, 4 columns, all zeros
        
        System.out.println(grid[2][3]);   // last element: prints 0
        System.out.println(grid[2][0]);   // row 3 does not exist!
    }
}
