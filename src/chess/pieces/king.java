package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class king extends ChessPiece{

	public king(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString(){
		return "k";
	}
	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

}
