package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook() {
		super();
	}

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("R");
		return builder.toString();
	}
}
