package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chess = new ChessMatch();

		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chess.getChessPieces());
				System.out.println();
				System.out.print("Source: ");

				ChessPosition source = UI.readChessPosition(sc);

				boolean[][] possibleMoves = chess.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chess.getChessPieces(), possibleMoves);
				
				System.out.println();
				System.out.print("Target: ");

				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chess.performChessMove(source, target);
			} catch (ChessException ce) {
				System.out.println(ce.getMessage());
				sc.nextLine();
			} catch (InputMismatchException ime) {
				System.out.println(ime.getMessage());
				sc.nextLine();
			}
		}

	}

}
