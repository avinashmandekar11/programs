import java.util.Scanner;

public class ConnectFour {

    private static final int ROWS = 6;
    private static final int COLUMNS = 7;
    private static final char EMPTY_SLOT = '.';
    private static final char PLAYER1_PIECE = 'X';
    private static final char PLAYER2_PIECE = 'O';

    private char[][] board = new char[ROWS][COLUMNS];
    private boolean gameOver = false;

    public ConnectFour() {
        initializeBoard();
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = PLAYER1_PIECE;

        while (!gameOver) {
            printBoard();
            System.out.println("Player " + (currentPlayer == PLAYER1_PIECE ? "1" : "2") + "'s turn");
            int column = getPlayerMove(scanner);

            if (makeMove(column, currentPlayer)) {
                if (checkWin(currentPlayer)) {
                    printBoard();
                    System.out.println("Player " + (currentPlayer == PLAYER1_PIECE ? "1" : "2") + " wins!");
                    gameOver = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("The game is a draw!");
                    gameOver = true;
                } else {
                    currentPlayer = (currentPlayer == PLAYER1_PIECE) ? PLAYER2_PIECE : PLAYER1_PIECE;
                }
            } else {
                System.out.println("Column is full or invalid, try again.");
            }
        }
        scanner.close();
    }

    private void initializeBoard() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                board[row][col] = EMPTY_SLOT;
            }
        }
    }

    private void printBoard() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("0 1 2 3 4 5 6");
    }

    private int getPlayerMove(Scanner scanner) {
        System.out.print("Enter column (0-6): ");
        int column = scanner.nextInt();
        while (column < 0 || column >= COLUMNS) {
            System.out.print("Invalid column. Enter column (0-6): ");
            column = scanner.nextInt();
        }
        return column;
    }

    private boolean makeMove(int column, char piece) {
        for (int row = ROWS - 1; row >= 0; row--) {
            if (board[row][column] == EMPTY_SLOT) {
                board[row][column] = piece;
                return true;
            }
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int col = 0; col < COLUMNS; col++) {
            if (board[0][col] == EMPTY_SLOT) {
                return false;
            }
        }
        return true;
    }

    private boolean checkWin(char piece) {
        // Check horizontal, vertical, and diagonal wins
        return checkHorizontalWin(piece) || checkVerticalWin(piece) || checkDiagonalWin(piece);
    }

    private boolean checkHorizontalWin(char piece) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col <= COLUMNS - 4; col++) {
                if (board[row][col] == piece &&
                    board[row][col + 1] == piece &&
                    board[row][col + 2] == piece &&
                    board[row][col + 3] == piece) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkVerticalWin(char piece) {
        for (int col = 0; col < COLUMNS; col++) {
            for (int row = 0; row <= ROWS - 4; row++) {
                if (board[row][col] == piece &&
                    board[row + 1][col] == piece &&
                    board[row + 2][col] == piece &&
                    board[row + 3][col] == piece) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkDiagonalWin(char piece) {
        // Check ascending diagonals
        for (int row = 3; row < ROWS; row++) {
            for (int col = 0; col <= COLUMNS - 4; col++) {
                if (board[row][col] == piece &&
                    board[row - 1][col + 1] == piece &&
                    board[row - 2][col + 2] == piece &&
                    board[row - 3][col + 3] == piece) {
                    return true;
                }
            }
        }

        // Check descending diagonals
        for (int row = 0; row <= ROWS - 4; row++) {
            for (int col = 0; col <= COLUMNS - 4; col++) {
                if (board[row][col] == piece &&
                    board[row + 1][col + 1] == piece &&
                    board[row + 2][col + 2] == piece &&
                    board[row + 3][col + 3] == piece) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ConnectFour game = new ConnectFour();
        game.playGame();
    }
}
