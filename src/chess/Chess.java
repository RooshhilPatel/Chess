package chess;
import java.util.Scanner;

import board.Board;
import board.Move;

public class Chess{
	public static boolean GameOver = false;
	public static void main(String[] args){
		Board.initialBoard();
		Board.printBoard();
		Scanner sc = new Scanner(System.in);
		while(GameOver == false){
			String a = sc.next();
			String b = sc.next();
			System.out.println();
			Move.MoveTo(a,b);
			Board.printBoard();
		}
		sc.close();
	}
	
}
