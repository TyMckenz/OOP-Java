
public class Party1 {
    public static String[] arr;
    public static int nextI;
    public String partyName;
    
    
    
    
    public Party1(String partyName) {
    	this.partyName = partyName;
    	arr[nextI] = partyName;
    	
    	System.out.println("Created " + partyName + " at index " + nextI);
    	nextI++;
    }
    
    public static void init(int size) {
    	arr = new String[size];
    	nextI = 0;
    	System.out.println("initialized shared party arry to size " + size);
    }
}
