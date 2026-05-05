class PlaceMove {

    char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    public boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Out of bounds!");
            return false;
        }

        if (board[row][col] != '-') {
            System.out.println("Invalid move: Cell already occupied!");
            return false;
        }

        return true;
    }
    public void placeMove(int row, int col, char symbol) {
        if (isValidMove(row, col)) {
            board[row][col] = symbol;  // ✅ State Update
            System.out.println("Move placed successfully!");
        } else {
            System.out.println("Move failed. Try again.");
        }
    }
    public void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PlaceMove game = new PlaceMove();

        game.printBoard();

        // Example move
        game.placeMove(1, 1, 'X');

        game.printBoard();
    }
}