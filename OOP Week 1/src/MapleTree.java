import java.util.*;
public class MapleTree {
 
	Scanner stdIn = new Scanner(System.in);
	
    private String plantDate;
    private String germDate;
    private double heightInCM;
 

    public MapleTree () {
  
    }
    
    public void setPlanting () {
    	
    	System.out.println("Please Enter The Date You Planted (dd/mm/yyyy): ");
    	plantDate = stdIn.next();
    }
    
    public void setGermination () {
    	
    	System.out.println("Please Enter the Germination Date (dd/mm/yyyy): ");
    	germDate = stdIn.next();
    	
    	System.out.println("Please Enter Height Observed In CM: ");
    	heightInCM = stdIn.nextDouble();
    	
    }

    

    public void dumpData() {
        System.out.println("The Day You Planted Was: " + plantDate);
        System.out.println("The Day Of First Sprouting Was: " + germDate);
        System.out.println("The Plant Measured At: " + heightInCM + " CM. ");

    }

}
