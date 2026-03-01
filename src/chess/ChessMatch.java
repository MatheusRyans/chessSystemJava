package chess;

import boardlayers.Board;
import boardlayers.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8); // Define o tamanho do tabuleiro
        initialSetup();
    }

    public ChessPiece[][] getPieces(){ //Retrona a matriz de peças do jogo
        ChessPiece[][] matrizPecas = new ChessPiece[board.getRows()][board.getColumns()]; //Minha matriz de peça tem o mesmo tamanho do tabuleiro
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                matrizPecas[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return matrizPecas;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board,Color.WHITE),new Position(2,1));
        board.placePiece(new King(board,Color.BLACK),new Position(0,4));
        board.placePiece(new King(board, Color.WHITE), new Position(7,4));
    }


}
