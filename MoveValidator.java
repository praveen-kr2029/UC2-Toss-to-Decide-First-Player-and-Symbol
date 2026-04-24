class MoveValidator {

    char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    // Method to validate move
    public boolean isValidMove(int row, int col) {

        // Check bounds (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Out of bounds!");
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            System.out.println("Invalid move: Cell already occupied!");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        MoveValidator game = new MoveValidator();

        int row = 1;
        int col = 1;

        if (game.isValidMove(row, col)) {
            System.out.println("Move is valid!");
        } else {
            System.out.println("Try again.");
        }
    }
}