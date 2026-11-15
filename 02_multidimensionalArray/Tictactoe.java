import java.util.Scanner;

public class Tictactoe {

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

        while (!gameOver) {

            // Print the board before every move
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

            // TASK 3: validate before touching the array
            if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
                System.out.println("That cell is outside the board. Try again.");
            } else if (board[row][col] != '-') {
                System.out.println("That cell is already taken. Try again.");
            } else {

                // TASK 2: place the mark
                board[row][col] = player;
                moves++;
                // System.out.println(moves);

                // TASK 4: check for a win (rows, columns, both diagonals)
                int n = board.length;
                boolean won = false;

                for (int i = 0; i < n; i++) {
                    boolean rowWin = true;
                    boolean colWin = true;
                    for (int j = 0; j < n; j++) {
                        if (board[i][j] != player) {
                            rowWin = false;
                        }
                        if (board[j][i] != player) {
                            colWin = false;
                        }
                    }
                    if (rowWin || colWin) {
                        won = true;
                    }
                }

                boolean diag1 = true;
                boolean diag2 = true;
                for (int i = 0; i < n; i++) {
                    if (board[i][i] != player) {
                        diag1 = false;
                    }
                    if (board[i][n - 1 - i] != player) {
                        diag2 = false;
                    }
                }
                if (diag1 || diag2) {
                    won = true;
                }

                if (won) {
                    System.out.println("Player " + player + " wins!");
                    gameOver = true;
                } else if (moves == n * n) {
                    // TASK 5
                    System.out.println("Draw!");
                    gameOver = true;
                } else if (player == 'X') {
                    player = 'O';
                } else {
                    player = 'X';
                }
            }
        }

        // Print the final board
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
    }
}