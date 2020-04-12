package application;

import javax.swing.plaf.synth.SynthSeparatorUI;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces){
		System.out.println("  ------------------");
		for(int i = 0; i< pieces.length ; i++){
			System.out.print("  "+(8 - i) + " ");
			for(int j = 0 ; j<pieces.length; j++){
				printPiece(pieces[i][j]);
				
			}
			System.out.print(" |");
			System.out.println();
		}
		System.out.println("    a b c d e f g h ");
		System.out.println("  ------------------- ");
		
		
	}
	public static void printPiece(ChessPiece piece){
		if(piece == null){
			System.out.print("-");
		}
		else{
			System.out.print(piece);
			
		}
		System.out.print(" ");
		
	}
	

}