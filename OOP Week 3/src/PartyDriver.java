
public class PartyDriver {

	public static void main(String[] args) {
		  Party party = new Party(3, "David Beckham");
		  

		  party.addGuest("Roberto Baggio");

		  party.addGuest("Zinedine Zidane");

		  party.addGuest("Roberto Baggio");

		  party.addGuest("Johan Cruyff");

		  party.addGuest("Diego Maradona");

		  party.printParty();

	}

}



//Roberto Baggio is already on the guest list.
//
//Diego Maradona cannot come to the party. The guest list is full.
//
//Guest list for David Beckham's party:
//
//Roberto Baggio
//
//Zinedine Zidane
//
//Johan Cruyff