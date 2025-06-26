import java.util.HashMap;
import java.util.Map;

public class Board {
    private final int BOARD_SIZE = 100;
    private final Map<Integer, Integer> snakes;
    private final Map<Integer, Integer> ladders;

    public Board() {
        // Initialize the maps in the constructor
        snakes = new HashMap<>();
        ladders = new HashMap<>();
        initializeBoard();
    }

    private void initializeBoard() {
        // Initialize Snakes (head -> tail)
        snakes.put(99, 10);
        snakes.put(65, 40);
        snakes.put(25, 9);
        snakes.put(95, 75);
        snakes.put(79, 19);
        snakes.put(88, 24);

        // Initialize Ladders (bottom -> top)
        ladders.put(13, 42);
        ladders.put(60, 83);
        ladders.put(70, 93);
        ladders.put(6, 45);
        ladders.put(37, 61);
        ladders.put(52, 71);
    }

    public int getNextPosition(int position) {
        // Check if position has a snake
        if (snakes.containsKey(position)) {
            int newPosition = snakes.get(position);
            System.out.println("Snake bite! Going down from " + position + " to " + newPosition);
            return newPosition;
        }

        // Check if position has a ladder
        if (ladders.containsKey(position)) {
            int newPosition = ladders.get(position);
            System.out.println("Ladder! Climbing up from " + position + " to " + newPosition);
            return newPosition;
        }

        return position;
    }

    public boolean isWinningPosition(int position) {
        return position == BOARD_SIZE;
    }
}
