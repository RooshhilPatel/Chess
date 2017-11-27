package board;

public class CoordinateVector {
	private int x, y;
	
	public void set (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public CoordinateVector(int x, int y){
		set(x,y);
	}
	
	public CoordinateVector(CoordinateVector coordinate){
		set(coordinate.x, coordinate.y);
	}
	
	public boolean equals(Object object){
		if(!(object instanceof CoordinateVector)) return false;
			CoordinateVector vec = (CoordinateVector) object;
		if(vec.getX() == this.getX() && vec.getY() == this.getY()) return true;
			return false;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
}
