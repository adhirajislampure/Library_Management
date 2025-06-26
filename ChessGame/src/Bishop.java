import java.awt.*;

public class Bishop extends Piece{


    private Color color;
    private Position position;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Bishop(Color color, Position position){
        super(color,position);

    }


    @Override
    public List<Position> getLegalMoves(Board board) {
        List<Position> legalMoves=new ArrayList<>();
        Position currentPosition=this.getPosition();

        int[][] directions={
                {-1,-1},
                {-1,1},
                {1,-1},
                {1,1}
        };

        for(int[] direction:directions){
            int x=currentPos.getX()+direction[0];
            int y=currentPos.getY()+direction[1];

            while(isValidPosition(x,y)){
                Position newPos=new Position(x,y);

                if(!board.isOccupied(newPos)){
                    legalMoves.add(newPos);
                }else if(board.getPiece(newPos).getColor()!=this.getColor()){
                    legalMoves.add(newPos);
                    break;
                }else{
                    break;
                }
                x+=direction[0];
                y+=direction[1];
            }
        }
        return legalMoves;
    }

    @Override
    public boolean canMove(Position newPosition, Board board) {
        return getLegalMoves(board).contains(newPosition);
    }

    private boolean isValidPosition(int x,int y){
        return x>=0 && x<8 &&y>=0 &&y<8;
    }

    public String toString(){
        return getColor()==Color.WHITE ?"W":"B";
    }
}
