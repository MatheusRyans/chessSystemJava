package chess;

import boardlayers.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8); // Define o tamanho do tabuleiro
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


}
