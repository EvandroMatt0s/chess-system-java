package chess_sytem.chess.pieces;

import chess_sytem.boardgame.Board;
import chess_sytem.chess.ChessPiece;
import chess_sytem.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "K";
    }
}
