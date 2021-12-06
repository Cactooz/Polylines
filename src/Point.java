public class Point {
	
	String name;
	int coordX, coordY;
	
	//Constructor for points, taking the name and x,y coords
	public void point(String n, int x, int y) {
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
}
