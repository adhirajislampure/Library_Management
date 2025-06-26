import java.awt.*;

public class Queen extends Piece{

    @Override
    public List<Position> getLegalMoves(Board board) {
        return null;
    }

    @Override
    public boolean canMove(Position newPosition, Board board) {
        return false;
    }
}
