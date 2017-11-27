package pieces;
import board.CoordinateVector;
import board.Move;
import board.Tile;

import java.util.List;

public abstract class Piece {

	protected final CoordinateVector position;
	protected final Side pieceColor;
	
	public Piece(int x, int y, Side col){
		this.position = new CoordinateVector(x,y);
		this.pieceColor = col;
	}
	
	public abstract List<Move> checkAllowedMove(Tile[][] BOARD);
	
}
