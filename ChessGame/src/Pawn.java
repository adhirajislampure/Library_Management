import java.awt.*;

public class Pawn extends Piece{

    private boolean hasMoved;
    private boolean canBeEnPassanted;

    public Pawn(boolean hasMoved, boolean canBeEnPassanted) {
        this.hasMoved = hasMoved;
        this.canBeEnPassanted = canBeEnPassanted;
    }

    @Override
    public List<Position> getLegalMoves(Board board) {
        return null;
    }

    @Override
    public boolean canMove(Position newPosition, Board board) {
        return false;
    }
    public void promote(Piece newPiece){

    }
}
