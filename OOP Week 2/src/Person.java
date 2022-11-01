
public class Person {
	private String firstName = "John";
	private String lastName = "Doe";
	private static int numberOfPeople = 0;

	
	public Person () {
		numberOfPeople++;
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		numberOfPeople++;
	}

	public void setFirst(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLast(String lastName) {
		this.lastName = lastName;
	}
	
	public static int getNumOfPeople() {
		return numberOfPeople;
	}
	
	public void printFullName() {
		System.out.println("The name is: " + firstName + " " + lastName);
	}
}
