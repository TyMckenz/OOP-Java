import java.util.*;
public class AutomobileDriver {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int carAmount;
		
		System.out.print("Please enter total amount of cars: ");
		carAmount = scn.nextInt();
		
		
		for (int i = 0; i < carAmount; ++i) {
			char makeChar =  ' ', colorChar = ' ';
			String makeS = " ", colorS = " ";
			Automobile car;
			
			while (true) {
			System.out.print("Select Buick, Chevrolet, or Pontiac (b,c,p): ");
			makeChar = scn.next().charAt(0);
			
			
			if (makeChar == 'b' || makeChar == 'c' || makeChar == 'p') {
				break;
				}
			System.out.println("The only valid selections are 'b', 'c', or 'p'");
			}
			
			
			
			
			while (true) {
				System.out.print("Select blue, green, or red (b,g,r): ");
				colorChar = scn.next().charAt(0);
				
				
				if (colorChar == 'b' || colorChar == 'g' || colorChar == 'r') {
					break;
					}
				System.out.println("The only valid selections are 'b', 'g', or 'r'");
				}
			
			switch(makeChar) {
			case 'b' : makeS = "Buick"; break;
			case 'c' : makeS = "Chevrolet"; break;
			case 'p' : makeS = "Pontiac"; break;
			}
			
			switch(colorChar) {
			case 'b' : colorS = "Blue"; break;
			case 'g' : colorS = "Green"; break;
			case 'r' : colorS = "Red"; break;
			}
			
			car = new Automobile();
			
			car.setMake(makeS);
			car.setColor(colorS);
			
			car.printMake().printColor();
			System.out.println();
			
		}
		scn.close();
	}

}
