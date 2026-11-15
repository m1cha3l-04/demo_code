public class Table2D {
    public static void main(String[] args) {
        int[][] scores = {
            {85, 90, 78, 90},                   // row 0
            {92, 88, 95}                    // row 1
        };

        System.out.println(scores[0][1]);       // row 0, column 1
        System.out.println(scores[1][2]);       // row 1, column 2
        scores[0][0] = 100;                     // change one element
        System.out.println(scores[0][0]);
        System.out.println(scores.length);      // number of rows
        System.out.println(scores[0].length);   // number of columns
    }
}
