class CheckWin {

    char[][] board = {
        {'X', 'X', 'X'},
        {'-', 'O', '-'},
        {'O', '-', '-'}
    };

    public boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) return true;
        }

        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) return true;
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) return true;

        return false;
    }

    public static void main(String[] args) {
        CheckWin game = new CheckWin();

        if (game.checkWin('X')) {
            System.out.println("Player X wins!");
        } else if (game.checkWin('O')) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("No winner yet.");
        }
    }
}
