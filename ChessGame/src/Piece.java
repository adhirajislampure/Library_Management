import java.awt.*;

public abstract class Piece {
    private Color color;
    private Position position;
    private boolean isAlive;

    public Piece(Color color, Position position, boolean isAlive) {
        this.color = color;
        this.position = position;
        this.isAlive = true;
    }

    public Color getColor(){
        return color;
    }
    public Position getPosition(){
        return position;
    }

    public void setPosition(Position position){
        this.position=position;
    }

    public boolean isAlive(){
        return isAlive;
    }

    public void setAlive(boolean alive){
        isAlive=alive;
    }

    public abstract List<Position> getLegalMoves(Board board);
    public abstract boolean canMove(Position newPosition, Board board);
}
