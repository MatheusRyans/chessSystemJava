package application;

import boardlayers.Position;
import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch(); //Cria a partida
        UI.printBoard(chessMatch.getPieces()); //Mostra o tabuleiro
    }
}