
public class Party {
	private final int totalGuests = 3;
	private int numberOfGuests = 0;
	private String partyThrower;
	private String[] guestList;

	
	
	public Party (int numberOfGuests, String partyThrower) {
		this.numberOfGuests = numberOfGuests;
		this.partyThrower = partyThrower;
		guestList = new String[totalGuests];
	}
	
	public void addGuest (String guestName) {
				
		if (guestList[ guestList.length - 1] != null) {
			System.out.println(guestName + " cannot come to the party. The guest list is full.");
			return;
			}
		
		for (String guest: guestList) {
			if (guest == guestName) {
				System.out.println(guestName + " is already on the list.");
				return;
				}
		}
			
			
		for (int i = 0;  i < guestList.length; ++i) {
				if (guestList[i] == null) {
					guestList[i] = guestName;
					numberOfGuests = i;
					break;
				}
			}
	}
	

	
	
	public void printParty() {
		System.out.println("Guest list for " + partyThrower + "'s party:");
		System.out.println(guestList[0]);
		System.out.println(guestList[1]);
		System.out.println(guestList[2]);
	}
	
	
	
}
