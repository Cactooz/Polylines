public class Point {
	
	String name;
	float coordX, coordY;
	
	//Constructor for points, taking the name and x,y coords
	public void point(String n, float x, float y) {
		name = n;
		coordX = x;
		coordY = y;
	}
	
	//Get the name of the point
	public String getName() {
		return name;
	}
	
	//Get the X coordinate of the point
	public float getCoordX() {
		return coordX;
	}
	
	//Get the Y coordinate of the point
	public float getCoordY() {
		return coordY;
	}
	
	//Set the name of the point
	public void setName(String n) {
		name = n;
	}
}
