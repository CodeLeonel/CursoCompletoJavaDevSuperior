package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	private ChessMatch chessMatch;
	
	public Pawn(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
	}

	@Override
	public boolean[][] possibleMoves() {
		
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);
		
		if(getColor() == Color.WHITE) {
			checkMove(mat,p,-1);
			if(getMoveCount() == 0) {
				checkMove(mat,p,-2);
			}
			checkAttack(mat, p, -1, 1);
			checkAttack(mat, p, -1, -1);
			
			enPassant(mat, 3, -1);
			
		} else {
			checkMove(mat,p,1);
			if(getMoveCount() == 0) {
				checkMove(mat,p,2);
			}
			checkAttack(mat, p, 1, 1);
			checkAttack(mat, p, 1, -1);
			
			enPassant(mat, 4, 1);
		}
		
		return mat;
	}
	
	private void checkMove(boolean[][] mat, Position p, int numberRow) {
		p.setValues(position.getRow() + numberRow, position.getColumn());
		if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
	}
	
	private void checkAttack(boolean[][] mat, Position p, int numberRow, int numberColumn) {
		p.setValues(position.getRow() + numberRow, position.getColumn() + numberColumn);
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
	}
	
	private void enPassant(boolean[][] mat,int positionRow, int row) {
		if(position.getRow() == positionRow) {
			Position left = new Position(position.getRow(), position.getColumn() - 1);
			if(getBoard().positionExists(left) && isThereOpponentPiece(left) && getBoard().getPiece(left) == chessMatch.getEnPassantVulnerable()) {
				mat[left.getRow() + row][left.getColumn()] = true;
			}
			Position right = new Position(position.getRow(), position.getColumn() + 1);
			if(getBoard().positionExists(right) && isThereOpponentPiece(right) && getBoard().getPiece(right) == chessMatch.getEnPassantVulnerable()) {
				mat[right.getRow() + row][right.getColumn()] = true;
			}
		}
	}
	
	@Override
	public String toString() {
		return "P";
	}

}
