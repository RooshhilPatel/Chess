package pieces;

import java.util.List;

import board.Move;
import board.Tile;

public class King extends Piece{

	public King(int x, int y, Side col) {
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
			return "wK ";
		else
			return "bK ";
	}

}
