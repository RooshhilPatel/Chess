package board;
import pieces.Bishop;
import pieces.Empty;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;
import pieces.Side;

public class Board{
	public static int turn = 0; //0 is white, 1 is black
	public static Tile[][] BOARD =  new Tile[8][8]; //game board that holds tiles which contain pieces
	//add pieces to tile only once
	public static final void add(int x, int y, Piece type){
		BOARD[x][y] = new Tile.PieceTile(x, y, type);
	}
	public static Piece get(int x, int y){
		return BOARD[x][y].getPiece();
	}
	
	public static final void initialBoard(){
		//black initial side
		add(0,0,new Rook(0, 0, Side.BLACK));
		add(0,1,new Knight(0, 1, Side.BLACK));
		add(0,2,new Bishop(0, 2, Side.BLACK));
		add(0,3,new Queen(0, 3, Side.BLACK));
		add(0,4,new King(0, 4, Side.BLACK));
		add(0,5,new Bishop(0, 5, Side.BLACK));
		add(0,6,new Knight(0, 6, Side.BLACK));
		add(0,7,new Rook(0, 7, Side.BLACK));
		for(int i = 0; i < 8; i++){
			add(1,i,new Pawn(0, 1, Side.BLACK));
		}
		
		//middle empty pieces
		for(int x = 2; x < 6; x++){
			for(int y = 0; y < 8; y++){
				if((x+y) % 2 == 0){
					add(x,y, new Empty(x, y, Side.WHITE));
				}else{
					add(x,y, new Empty(x, y, Side.BLACK));
				}
			}
		}
		
		//white initial side
		for(int i = 0; i < 8; i++){
			add(6,i,new Pawn(0, 1, Side.WHITE));
		}
		add(7,0,new Rook(0, 0, Side.WHITE));
		add(7,1,new Knight(0, 1, Side.WHITE));
		add(7,2,new Bishop(0, 2, Side.WHITE));
		add(7,3,new Queen(0, 3, Side.WHITE));
		add(7,4,new King(0, 4, Side.WHITE));
		add(7,5,new Bishop(0, 5, Side.WHITE));
		add(7,6,new Knight(0, 6, Side.WHITE));
		add(7,7,new Rook(0, 7, Side.WHITE));
	}
	//prints current board state
	public static final void printBoard(){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j <8; j++){
				System.out.print(BOARD[i][j]);
 			}
			System.out.print(8-i);
			System.out.println();
		}
		for(int i = 97; i < 105; i++){
			System.out.print(" " + Character.toString ((char) i) + " ");
		}
		System.out.println();
		System.out.println();
		if(turn == 0){
			System.out.print("White's Move: ");
			turn = 1;
		}else if(turn == 1){
			System.out.print("Black's Move: ");
			turn = 0;
		}
	}

}
