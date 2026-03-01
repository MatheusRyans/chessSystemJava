package application;

import chess.ChessPiece;

//CLASSE PARA CRIAR A INTERFACE PARA O USUARIO
public class UI {

    public static void printBoard(ChessPiece[][] pieces){ //interface do tabuleiro
        for (int i = 0; i < pieces.length ; i++) {
            System.out.print(8 - i + " "); //Indica a linha
            for (int j = 0; j < pieces.length ; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  A B C D E F G H"); //Indica a Coluna
    }

    private static void printPiece(ChessPiece piece){ //impressão de uma unica peça
        if (piece == null) {
            System.out.print("-");
        }
        else{
            System.out.print(piece);
        }
        System.out.print(" ");
    }


}
