package boardgame;

public class Piece {

	protected Position position = null;
	private Board board;
	
	public Piece() {
	}
	
	public Piece(Board board) {
		super();
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
	
}
