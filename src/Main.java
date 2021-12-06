import java.io.PrintWriter;

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
	}
}
