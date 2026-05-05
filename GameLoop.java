import java.util.Random;
import java.util.Scanner;

class GameLoop {

    char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    char currentPlayer = 'X';

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) return false;
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

    public boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) return true;
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) return true;
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) return true;
        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }

    public void playerMove() {
        int slot = scanner.nextInt();
        int[] pos = convertSlot(slot);
        if (isValidMove(pos[0], pos[1])) {
            placeMove(pos[0], pos[1], 'X');
        } else {
            playerMove();
        }
    }

    public void computerMove() {
        while (true) {
            int slot = rand.nextInt(9) + 1;
            int[] pos = convertSlot(slot);
            if (isValidMove(pos[0], pos[1])) {
                placeMove(pos[0], pos[1], 'O');
                break;
            }
        }
    }

    public void startGame() {
        while (true) {
            printBoard();

            if (currentPlayer == 'X') {
                System.out.print("Enter slot (1-9): ");
                playerMove();
                if (checkWin('X')) {
                    printBoard();
                    System.out.println("Player wins!");
                    break;
                }
                currentPlayer = 'O';
            } else {
                computerMove();
                if (checkWin('O')) {
                    printBoard();
                    System.out.println("Computer wins!");
                    break;
                }
                currentPlayer = 'X';
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("Draw!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        GameLoop game = new GameLoop();
        game.startGame();
    }
}
