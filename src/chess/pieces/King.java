package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King() {
		super();
	}

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K");
		return builder.toString();
	}
}