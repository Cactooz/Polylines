import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//Add two new objects
		Point p1 = new Point("A", 3, 4);
		Point p2 = new Point("B", 5, 6);
		System.out.println(p1 + "    " + p2);
		
		//Get the attributes of p1
		String n = p1.getName();
		int x = p1.getCoordX();
		int y = p1.getCoordY();
		System.out.println(n + " " + x + " " + y);
		
		//Get the distance and check if the points are the same
		float d = p1.distance(p2);
		System.out.println (d);
		boolean b = p1.equals(p2);
		System.out.println(b);
		
		//Edit the coordinate values of p2
		p2.setCoordX(1);
		p2.setCoordY(2);
		System.out.println(p2);
		
		//Add a point p with the same attributes as p1
		Point p = new Point(p1);
		System.out.println(p);
		
		Point[] polylinePointer = new Point[]{new Point("A", 5, 1), new Point("B", 3, 4), new Point("C", 6, 1), new Point("D", 3, 2)};
		
		Polyline poly1 = new Polyline(polylinePointer);
		System.out.println("Width: " + poly1.getWidth());
		System.out.println("Color: " + poly1.getColor());
		poly1.setColor("blue");
		poly1.setWidth(2);
		System.out.println("Length: " + poly1.length());
		System.out.println(Arrays.toString(poly1.getPoints()));
		
		Point p10 = new Point("Q", 10, 2);
		poly1.addPointStart(p10);
		System.out.println(poly1.toString());
		poly1.remove("D");
		System.out.println(poly1.toString());
		poly1.addPoint(p10, "B");
		System.out.println(poly1.toString());
		
		Polyline.PolylineIterator it = poly1.new PolylineIterator();
		it.printPunkt();
	}
}
