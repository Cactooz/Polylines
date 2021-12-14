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
	}
	
	//Create a random point
	private static Point randomPoint() {
		//Give the point a random letter
		String name = "" + (char) (65 + random.nextInt(26));
		
		//Give the point random coordinates
		int x = random.nextInt(20);
		int y = random.nextInt(20);
		
		return new Point(name, x, y);
	}
	
	private static Polyline randomPolyline() {
		Polyline polyline = new Polyline();
		
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
			if(!chosenNames[65 - chosenChar]) {
				polyline.addPoint(chosenPoint);
				chosenNames[65 - chosenChar] = true;
			}
		}
		
		
		
		return polyline;
	}
}
