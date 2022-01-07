public class Polyline1 {
	private Point[] points;
	private String color = "black";
	private int width = 1;
	
	public Polyline1() {
		points = new Point[0];
	}
	
	public Polyline1(Point[] points) {
		points = new Point[points.length];
		for(int i = 0; i < points.length; i++) {
			points[i] = new Point(points[i]);
		}
	}
	
	public Point[] getPoints() {
		Point[] newPoints = new Point[points.length];
		
		for(int i = 0; i < newPoints.length; i++) {
			newPoints[i] = new Point(points[i]);
		}
		
		return newPoints;
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
	
}
