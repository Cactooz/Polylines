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
	
}
