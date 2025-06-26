public class Square {

    private Position position;
    private Piece piece;
    private Color color;

    public Square(Color color, Position position) {
        this.color=color;
        this.piece=piece;
        this.position=position;

    }

    public boolean isOccupied(){
        return piece!=null;
    }
}
