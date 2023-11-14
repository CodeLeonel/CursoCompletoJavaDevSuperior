package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece cp = (ChessPiece) getBoard().getPiece(position);
		return cp != null && cp.getColor() != color;
	}

	public Color getColor() {
		return color;
	}

}
