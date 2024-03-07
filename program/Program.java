package chess_sytem.program;

import chess_sytem.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());

    }
}
