package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {

		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// above
		checkMove(mat, p, -1, 0);
		checkAttack(mat, p);

		// left
		checkMove(mat, p, 0, -1);
		checkAttack(mat, p);

		// below
		checkMove(mat, p, 1, 0);
		checkAttack(mat, p);

		// right
		checkMove(mat, p, 0, 1);
		checkAttack(mat, p);

		// NW
		checkMove(mat, p, -1, -1);
		checkAttack(mat, p);

		// NE
		checkMove(mat, p, -1, 1);
		checkAttack(mat, p);

		// SW
		checkMove(mat, p, 1, -1);
		checkAttack(mat, p);

		// SE
		checkMove(mat, p, 1, 1);
		checkAttack(mat, p);

		return mat;
	}

	private void checkMove(boolean[][] mat, Position p, int numberRow, int numberColumn) {
		p.setValues(position.getRow() + numberRow, position.getColumn() + numberColumn);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + numberRow, p.getColumn() + numberColumn);
			;
		}
	}

	private void checkAttack(boolean[][] mat, Position p) {
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
	}
	
	@Override
	public String toString() {
		return "Q";
	}

}
