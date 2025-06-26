public class Board {
    private Square[][] squares;
    private List<Piece> capturedPieces;

    public Board(){
        squares = new Square[8][8];
        initializeBoard();
    }

//    public Board(Square[][] squares, List<Piece> capturedPieces) {
//        this.squares = squares;
//        this.capturedPieces = capturedPieces;
//        initializeBoard();
//    }
    public boolean movePiece(Position from,Position to){

    }
    public boolean isCheck(Color color){

    }
    public boolean isCheckMate(Color color){

    }
    public boolean isStaleMate(Color color){

    }

    public void initializeBoard(){
        squares[0][2]= new Square(Color.BLACK,new Position(0,2));
        squares[0][5]= new Square(Color.BLACK, new Position(0, 5));
    }

}
