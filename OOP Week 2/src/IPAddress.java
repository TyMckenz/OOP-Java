


public class IPAddress {
	private String dottedDecimal;
	private int firstOctet;
	private int secondOctet;
	private int thirdOctet;
	private int fourthOctet;
	
	
	public IPAddress (String IPAddress) {
		dottedDecimal = IPAddress;
		
	}
	
	public String getDottedDecimal() {
		return dottedDecimal;
		
	}
	
	public void splitOctet() {
		char divider = '.';
		String temp = dottedDecimal;
		int counter = 1;
		
		while (temp.indexOf(divider) != -1) {
		int indexStore = temp.indexOf(divider);
		String st = temp.substring(0, indexStore);
		temp = temp.substring(indexStore + 1);
		
		switch(counter) {
		case 1: firstOctet = Integer.parseInt(st); break;
		case 2: secondOctet = Integer.parseInt(st); break;
		case 3: thirdOctet = Integer.parseInt(st); break;
		}
		
		counter++;
		}
		fourthOctet = Integer.parseInt(temp);
		
	}
	

	public int getOctet (int octetIndex) {
		if (octetIndex == 1) {
			return firstOctet;
		}
		else if (octetIndex == 2) {
			return secondOctet;
		}
		else if (octetIndex == 3) {
			return thirdOctet;
		}
		else  {
			return fourthOctet;
		}
	
	}
}
	


