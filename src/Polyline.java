public class Polyline {
	private Point[] points;
	private String color = "black";
	private int width = 1;
	
	public Polyline() {
		points = new Point[0];
	}
	
	public Polyline(Point[] points) {
		points = new Point[points.length];
		for(int i = 0; i < points.length; i++) {
			points[i] = new Point(points[i]);
		}
	}
	
	public Point[] getPoints() {
		return points;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	
	//Get the length of the polyline
	public float length() {
		//Set the start length to 0
		float length = 0;
		
		//Add the length between the point to the next point into the total length
		for(int i = 0; i < points.length-1; i++) {
			length += points[i].distance(points[i+1]);
		}
		
		return length;
	}
	
	//Add a point to the end of the array
	public void addPoint(Point newPoint) {
		//Set a temporary array that is bigger
		Point[] tempPoints = new Point[points.length+1];
		
		//Add the old points to the array
		for(int i = 0; i < points.length; i++) {
			tempPoints[i] = points[i];
		}
		//Add the new point at the end of the array
		tempPoints[tempPoints.length - 1] = newPoint;
		
		points = tempPoints;
	}
	
}
