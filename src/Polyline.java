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
		Point[] getPoints = new Point[points.length];
		
		//Add all elements into the new array
		for(int i = 0; i < getPoints.length; i++) {
			getPoints[i] = points[i];
		}
		
		return getPoints;
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
	
	//Add a point to the start of the array
	public void addPointStart(Point newPoint) {
		//Set a temporary array that is bigger
		Point[] tempPoints = new Point[points.length+1];
		
		//Add the new point at the start of the array
		tempPoints[0] = newPoint;
		
		//Add the old points to the array
		for(int i = 1; i < tempPoints.length; i++) {
			tempPoints[i] = points[i];
		}
		
		points = tempPoints;
	}
	
	//Remove a point defined by its frame from the array
	public void remove(String pointName) {
		//Set a temporary array that is smaller
		Point[] tempPoints = new Point[points.length-1];
		
		//Add all points to the array except the one with the defined name to remove
		for(int i = 1; i < tempPoints.length; i++) {
			if(points[i].getName() != pointName)
				tempPoints[i] = points[i];
		}
		
		points = tempPoints;
	}
	
}
