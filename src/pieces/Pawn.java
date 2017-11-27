package pieces;

import java.util.List;

import board.Move;
import board.Tile;

public class Pawn extends Piece{

	public Pawn(int x, int y, Side col) {
		super(x, y, col);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Move> checkAllowedMove(Tile[][] BOARD) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString(){
		if(this.pieceColor == Side.WHITE)
			return "wp ";
		else
			return "bp ";
	}

}
