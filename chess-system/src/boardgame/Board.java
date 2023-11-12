package boardgame;

public class Board {

	private int rows;
	
	private int columns;
	
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}
	
	public void placePiece(Piece piece, Position position) {
		this.pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	public Piece getPiece(int row, int column) {
		return this.pieces[row][column];
	}
	
	public Piece getPiece(Position position) {
		return this.pieces[position.getRow()][position.getColumn()];
	}
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
}
