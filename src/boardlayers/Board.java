package boardlayers;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1){
            throw new BoardExcepition("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }
    public Piece piece(int rows, int columns){
        if (!positionExistis(rows,columns)){
            throw new BoardExcepition("Position not on the board");
        }
        return pieces[rows][columns];
    }

    public Piece piece(Position position){
        if (!positonExists(position)){
            throw new BoardExcepition("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if (thereIsAPice(position)){
            throw new BoardExcepition("There is already a piece on position " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece; //Coloca na matriz de peças do tabuleiro uma peça em uma posição
        piece.position = position;
    }

    private boolean positionExistis(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positonExists(Position position){
        return positionExistis(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPice(Position position){
        if(!positonExists(position)){
            throw new BoardExcepition("Position not on the board");
        }
        return piece(position) != null;
    }

}
