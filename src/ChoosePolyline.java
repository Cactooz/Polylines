import java.util.Random;

public class ChoosePolyline {
	static final Random random = new Random();
	
	public static void main(String[] args) {
	
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
}
