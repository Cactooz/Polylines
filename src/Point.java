public class Point {
	
	String name;
	int coordX, coordY;
	
	//Constructor for points, taking the name and x,y coords
	public Point(String n, int x, int y) {
		name = n;
		coordX = x;
		coordY = y;
	}
	
	//Get the name of the point
	public String getName() {
		return name;
	}
	
	//Get the X coordinate of the point
	public int getCoordX() {
		return coordX;
	}
	
	//Get the Y coordinate of the point
	public int getCoordY() {
		return coordY;
	}
	
	//Set the name of the point
	public void setName(String n) {
		name = n;
	}
	
	//Set the X coordinate of the point
	public void setCoordX(int x) {
		coordX = x;
	}
	
	//Set the Y coordinate of the point
	public void setCoordY(int y) {
		coordY = y;
	}
	
	public float distance(Point p2) {
		int p2X = p2.getCoordX();
		int p2Y = p2.getCoordY();
		
		int differenceX = this.coordX - p2X;
		int differenceY = this.coordY - p2Y;
		
		return (float) Math.sqrt(differenceX * differenceX + differenceY * differenceY);
	}
}
