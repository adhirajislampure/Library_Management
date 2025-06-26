import java.awt.*;
import java.util.ArrayList;

public class King extends Piece{

    private boolean hasMoved;

    public King(Color color, Position position, boolean isAlive) {
        super(color, position, isAlive);
        this.hasMoved=false;
    }

    @Override
    public List<Position> getLegalMoves(Board board) {
        List<Position> legalMoves=new ArrayList<>();
        Position currentPos=getPosition();

        int[][] directions={
                {-1,-1},
                {-1,0},
                {-1,1},
                {0,-1},
                {0,1},
                {1,-1},
                {0,1},
                {1,1}
        };

    }

    @Override
    public boolean canMove(Position newPosition, Board board) {
        return false;
    }
    public boolean canCastle(Rook rook){

    }
}
