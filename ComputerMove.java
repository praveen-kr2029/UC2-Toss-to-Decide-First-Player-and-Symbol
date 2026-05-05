import java.util.Random;

class ComputerMove {

    char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    Random rand = new Random();

    public boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        return board[row][col] == '-';
    }

    public int[] convertSlot(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public void computerMove() {
        while (true) {
            int slot = rand.nextInt(9) + 1;
            int[] pos = convertSlot(slot);

            int row = pos[0];
            int col = pos[1];

            if (isValidMove(row, col)) {
                placeMove(row, col, 'O');
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ComputerMove game = new ComputerMove();

        game.printBoard();
        game.computerMove();
        game.printBoard();
    }
}