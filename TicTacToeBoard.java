class TicTacToeBoard {

    // 2D array for board
    char[][] board = new char[3][3];

    // Initialize board with '-'
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                board[i][j] = '-';
            }
        }
    }

    // Print board
    public void printBoard() {
        System.out.println("Tic-Tac-Toe Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // next line after each row
        }
    }

    public static void main(String[] args) {
        TicTacToeBoard game = new TicTacToeBoard();

        game.initializeBoard();
        game.printBoard();
    }
}