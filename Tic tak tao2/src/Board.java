import java.util.HashMap;
import java.util.Map;

public class Board {
    private final int BOARD_SIZE=100;
    private final Map<Integer,Integer> snakes;
    private final Map<Integer,Integer> ladders;

    public Board(){
        snakes=new HashMap<>();
        ladders=new HashMap<>();
        initializeBoard();
    }

    private void initializeBoard() {
        snakes.put(16,6);
        snakes.put(47,26);
        snakes.put(49,11);
        snakes.put(56,53);
        snakes.put(62,19);
        snakes.put(64,60);
        snakes.put(87,24);
        snakes.put(93,73);
        snakes.put(95,75);
        snakes.put(98,78);

        ladders.put(1,38);
        ladders.put(4,14);
        ladders.put(9,31);
        ladders.put(21,42);
        ladders.put(28,84);
        ladders.put(36,44);
        ladders.put(51,67);
        ladders.put(71,91);
        ladders.put(80,100);
    }

    public int getNextPosition(int currentPosition){
        if(snakes.containsKey(currentPosition)){
            int newPosition=snakes.get(currentPosition);
            System.out.println("Oops! Snake at "+currentPosition+" moved to "+newPosition);
            return newPosition;
        }

        if(ladders.containsKey(currentPosition)){
            int newPosition=ladders.get(currentPosition);
            System.out.println("Yay! Ladder at "+currentPosition+" moved to "+newPosition);
            return newPosition;
        }
        return currentPosition;
    }
    public boolean isWinningPosition(int position){
        return position==BOARD_SIZE;
    }
}
