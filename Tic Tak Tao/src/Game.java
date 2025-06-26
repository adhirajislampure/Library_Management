// Game.java
import java.util.*;

public class Game {
    private final Board board;
    private final List<Player> players;
    private final Dice dice;
    private int currentPlayerIndex;
    private boolean gameOver;

    public Game(int numPlayers) {
        if (numPlayers < 2 || numPlayers > 4) {
            throw new IllegalArgumentException("Number of players must be between 2 and 4");
        }

        this.board = new Board();
        this.dice = new Dice();
        this.players = new ArrayList<>();
        this.currentPlayerIndex = 0;
        this.gameOver = false;

        initializePlayers(numPlayers);
    }

    private void initializePlayers(int numPlayers) {
        for (int i = 0; i < numPlayers; i++) {
            players.add(new Player("Player " + (i + 1)));
        }
    }

    public void startGame() {
        System.out.println("Game started!");

        while (!gameOver) {
            Player currentPlayer = players.get(currentPlayerIndex);

            // Display current state
            System.out.println("\n" + currentPlayer.getName() + "'s turn");
            System.out.println("Current position: " + currentPlayer.getPosition());
           // System.out.println("Current board state:");

            // Roll dice and make move
            int diceValue = dice.roll();
            System.out.println("Dice roll: " + diceValue);
            makeMove(currentPlayer, diceValue);

            // Check if player has won
            if (board.isWinningPosition(currentPlayer.getPosition())) {
                System.out.println("\n🎉 " + currentPlayer.getName() + " wins the game! 🎉");
                gameOver = true;
            } else {
                switchPlayer();
            }
        }
    }

    private void makeMove(Player player, int diceValue) {
//        int currentPosition = player.getPosition();
//        int newPosition = currentPosition + diceValue;
        int currentPosition=player.getPosition();
        int newPosition=currentPosition+diceValue;

//        if (newPosition > 100) {
//            System.out.println("Cannot move - Need exact number to win!");
//            return;
//        }
        if(newPosition>100){
            System.out.println("Cannot move forward needs exact number");
            return;
        }

        // Get next position after considering snakes and ladders
        newPosition = board.getNextPosition(newPosition);
        player.setPosition(newPosition);

        System.out.println(player.getName() + " moved from " + currentPosition + " to " + newPosition);
    }

    private void switchPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
}