import java.util.Random;

public class ChoosePolyline {
	static final Random random = new Random();
	static final int polylineAmount = 10;
	
	public static void main(String[] args) {
		Polyline[] polylines = new Polyline[polylineAmount];
		
		//Fill the array with polylines
		for(int i = 0; i < polylineAmount; i++) {
			polylines[i] = randomPolyline();
		}
		
		//Set thee shortestPath to infinity
		float shortestPath = Float.POSITIVE_INFINITY;
		//Variable keeping track of the shortest path
		int path = -1;
		
		//Get the shortest yellow polyline
		for(int i = 0; i < polylineAmount; i++) {
			if(polylines[i].getColor() == "yellow") {
				if(polylines[i].length() < shortestPath) {
					shortestPath = polylines[i].length();
					path = i;
				}
			}
		}
		
		//Check if there is any yellow polylines at all
		if(path == -1)
			System.out.println("No yellow path could be found");
		else
			System.out.println(polylines[path].toString());
	}
	
	//Create a random point
	private static Point randomPoint() {
		//Give the point a random letter
		String name = "" + (char) (65 + random.nextInt(26));
		
		//Give the point random coordinates
		int x = random.nextInt(11);
		int y = random.nextInt(11);
		
		return new Point(name, x, y);
	}
	
	//Create a polyline with random points and color
	private static Polyline randomPolyline() {
		Polyline polyline = new Polyline();
		
		//Get a random amount of points
		int totalPoints = 2 + random.nextInt(8);
		boolean[] chosenNames = new boolean[26];
		Point chosenPoint = null;
		char chosenChar = 0;
		
		for(int i = 0; i < totalPoints; i++) {
			//Create a new randomized point
			chosenPoint = randomPoint();
			//Get the name of the point
			chosenChar = chosenPoint.getName().charAt(0);
			
			//Only add the point if the name hasn't been used before
			if(!chosenNames[chosenChar - 65]) {
				polyline.addPoint(chosenPoint);
				chosenNames[chosenChar - 65] = true;
			}
		}
		
		//Get a random color for the polyline
		String color = "";
		int colorOption = random.nextInt(3);
		switch(colorOption) {
			case 0 -> color = "blue";
			case 1 -> color = "red";
			case 2 -> color = "yellow";
		}
		polyline.setColor(color);
		
		return polyline;
	}
}
