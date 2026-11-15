import java.util.Scanner;

public class TicTacToe_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TASK 1: build the board (change SIZE to 4 for the challenge)
        final int SIZE = 3;
        char[][] board = new char[SIZE][SIZE];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                board[r][c] = '-';
            }
        }
        
        char player = 'X';
        int moves = 0;
        boolean gameOver = false;

        // Print the board
        while (!gameOver) {
            System.out.print("   ");
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(c + " ");
            }
            System.out.println();

            for (int r = 0; r < board.length; r++) {
                System.out.print(r + "  ");
                for (int c = 0; c < board[r].length; c++) {
                    System.out.print(board[r][c] + " ");
                }
                System.out.println();
            }

            System.out.print("Player " + player + ", enter row: ");
            int row = sc.nextInt();
            System.out.print("Player " + player + ", enter column: ");
            int col = sc.nextInt();

            // validate input (with in the range of the board)
            // board[0][0] = '0';
            if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
                System.out.println("That cell is outside the board. Try again.");
            } else if (board[row][col] != '-') {
                System.out.println("The cell is already taken. Try again.");
            } else {
                board[row][col] = player;
                moves++;

                int n = board.length;
                boolean won = false;

                // check for a win

                for (int i = 0; i < n; i++) {
                    boolean rowWin = true;
                    boolean colWin = true;
                    for (int j = 0; j < n; j++) {
                        if (board[i][j] != player) rowWin = false;
                        if (board[j][i] != player) colWin = false;
                    }
                    if (rowWin || colWin) won = true;
                }

                // check for a win in diagonal
                boolean diag1 = true;
                boolean diag2 = true;

                for (int i = 0; i < n; i++) {
                    if (board[i][i] != player) diag1 = false;
                    if (board[i][n - 1 - i] != player) diag2 = false;

                }

                if (diag1 || diag2) won = true;

                if (won) {
                    System.out.println("Player " + player + " wins.");
                    gameOver = true;
                } else if (moves == n * n){
                    System.out.println("Draw!");
                    gameOver = true;
                } else if (player == 'X') {
                    player = 'O';
                } else {
                    player = 'X';
                }

            }
            // gameOver = true;

        }
    }
}