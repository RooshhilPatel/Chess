package board;

import pieces.Piece;

public abstract class Tile {
	
	protected final CoordinateVector location;
	public abstract boolean hasPiece();
	public abstract Piece getPiece();
	
	public Tile(int x, int y){
		this.location = new CoordinateVector(x,y);
	}
	
	public static final class PieceTile extends Tile{
		private final Piece piece;
		
		public PieceTile(int x, int y, Piece piece) {
			super(x,y);
			this.piece = piece;
		}
		
		@Override
		public boolean hasPiece(){
			return true;
		};
		
		@Override
		public Piece getPiece(){
			return this.piece;
		};
	
	}
	
	public String toString(){
		return getPiece().toString();
	}

}
