import java.util.Random;

class TossGame {

    // Game state variables
    String player1 = "Player 1";
    String player2 = "Player 2";

    char player1Symbol;
    char player2Symbol;

    String currentPlayer;

    public void startGame() {
        System.out.println("Game Started!");

        performToss();

        System.out.println("First Player: " + currentPlayer);
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
    }

    public void performToss() {
        Random rand = new Random();

        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
            System.out.println(player1 + " won the toss!");
        } else {
            currentPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
            System.out.println(player2 + " won the toss!");
        }
    }

    public static void main(String[] args) {
        TossGame game = new TossGame();
        game.startGame();
    }
}