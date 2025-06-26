import java.util.List;

public class Game {
    private Board board;
    private Player whitePlayer;
    private Player blackPlayer;
    private Player currentPlayer;
    private GameStatus status
    private List<Move> moveHistory;

    public void initialize(){

    }
    public boolean makeMove(Move move){

    }
    public void switchPlayer(){
        currentPlayer=(currentPlayer==whitePlayer)?blackPlayer:whitePlayer;
    }

    public GameStatus getGameStatus(){
        return status;
    }

}
