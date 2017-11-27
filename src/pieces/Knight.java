package pieces;

import java.util.List;

import board.Move;
import board.Tile;

public class Knight extends Piece{
	
	public Knight(int x, int y, Side col) {
		super(x, y, col);
	}

	@Override
	public List<Move> checkAllowedMove(Tile[][] BOARD) {
		return null;
	}
	
	public String toString(){
		if(this.pieceColor == Side.WHITE)
			return "wN ";
		else
			return "bN ";
	}

}
