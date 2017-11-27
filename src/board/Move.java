package board;
import board.Board;
import pieces.Empty;
import pieces.Piece;
import pieces.Side;

public class Move {
	private static int x1, y1, x2 , y2;
	public static void MoveTo(String a, String b){
		x1 = Character.getNumericValue(a.toLowerCase().substring(0,1).charAt(0)) - 10;
		y1 = 8 -Character.getNumericValue(a.toLowerCase().substring(1,2).charAt(0));
		x2 = Character.getNumericValue(b.toLowerCase().substring(0,1).charAt(0)) - 10;
		y2 = 8 -Character.getNumericValue(b.toLowerCase().substring(1,2).charAt(0));
		
		Piece curr = Board.get(y1, x1);	//need to switch x and y because that's how arrays work
		if(curr.toString() == "   " || curr.toString() == "## "){
			error("empty");
			System.out.println();
			return;
		}
		
		if((x1+y1) % 2 == 0){
			Board.add(y1, x1, new Empty(y1,x1, Side.WHITE));
		}else{
			Board.add(y1, x1, new Empty(y1,x1, Side.BLACK));
		}

		Board.add(y2, x2, curr);
		
	}
	
	public static final void error(String error){
		if(Board.turn == 0){
			Board.turn = 1;
		}else if(Board.turn == 1){
			Board.turn = 0;
		}
		switch(error.toLowerCase()){
		case "empty":
			System.out.println("You need to select a piece to move");
			break;
		default:
			System.out.println("Illeagal move, try again");
		}
	}
	
}
