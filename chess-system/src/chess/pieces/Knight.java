package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		checkMove(mat,p,-1,2);
		checkMove(mat,p,-2,1);
		checkMove(mat,p,-1,-2);
		checkMove(mat,p,-2,-1);
		checkMove(mat,p,1,2);
		checkMove(mat,p,2,1);
		checkMove(mat,p,1,-2);
		checkMove(mat,p,2,-1);
		
		return mat;
	}
	
	private void checkMove(boolean[][] mat, Position p, int numberRow, int numberColumn) {
		p.setValues(position.getRow() + numberRow, position.getColumn() + numberColumn);
		if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
	}
	
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().getPiece(position);
		return p == null || p.getColor() != getColor();
	}
	
	@Override
	public String toString() {
		return "N";
	}

}
