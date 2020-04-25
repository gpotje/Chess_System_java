package chess.pieces;

import boardgame.Board;
import boardgame.Position;
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
	
	private boolean canMoves(Position position){
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		
		// Above
		// ----------------------------------------------------------------------------
		p.setValues(position.getRow() - 1, position.getColumn());
		if (getBoard().positionExistes(p) && canMoves(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// -----------------------------------------------------------------------------------
		// Below
		// ----------------------------------------------------------------------------
		p.setValues(position.getRow() + 1, position.getColumn());
		if (getBoard().positionExistes(p) && canMoves(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// -----------------------------------------------------------------------------------
		// Left
		// ----------------------------------------------------------------------------
		p.setValues(position.getRow(), position.getColumn() - 1);
		if (getBoard().positionExistes(p) && canMoves(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// -----------------------------------------------------------------------------------
		// Right
		// ----------------------------------------------------------------------------
		p.setValues(position.getRow(), position.getColumn() + 1 );
		if (getBoard().positionExistes(p) && canMoves(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// -----------------------------------------------------------------------------------
		// NW
		// ----------------------------------------------------------------------------
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		if (getBoard().positionExistes(p) && canMoves(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// -----------------------------------------------------------------------------------
		// NE
		// ----------------------------------------------------------------------------
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		if (getBoard().positionExistes(p) && canMoves(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// -----------------------------------------------------------------------------------
		// SW
		// ----------------------------------------------------------------------------
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		if (getBoard().positionExistes(p) && canMoves(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// -----------------------------------------------------------------------------------
		// SE
		// ----------------------------------------------------------------------------
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		if (getBoard().positionExistes(p) && canMoves(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// -----------------------------------------------------------------------------------
		
	
		return mat;
	}

}
