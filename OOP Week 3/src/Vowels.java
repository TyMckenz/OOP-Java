import java.util.*;
import java.lang.*;
public class Vowels {

	private int [][] _vowels;
	private String userSentence;
	
	public Vowels () {
		_vowels = new int[5][2];
	}
	
	public void setUserSentence() {
		Scanner scnr = new Scanner(System.in);
		
		do {
		System.out.println("Please enter a line of characters (press enter by itself to quit): ");
		userSentence = scnr.nextLine();
		processLine(userSentence);
		} while (userSentence != "");
		printSummary();
		scnr.close();
		
	}
	
	public void processLine (String userSentence) {
		
		
		for (int i = 0; i < userSentence.length(); i++) {
			if (userSentence.charAt(i) == 'a') {
				_vowels[0][0]++;
			}
			else if (userSentence.charAt(i) == 'A') {
				_vowels[0][1]++;
			}
			else if (userSentence.charAt(i) == 'e') {
				_vowels[1][0]++;
			}
			else if (userSentence.charAt(i) == 'E') {
				_vowels[1][1]++;
			}
			else if (userSentence.charAt(i) == 'i') {
				_vowels[2][0]++;
			}
			else if (userSentence.charAt(i) == 'I') {
				_vowels[2][1]++;
			}
			else if (userSentence.charAt(i) == 'o') {
				_vowels[3][0]++;
			}
			else if (userSentence.charAt(i) == 'O') {
				_vowels[3][1]++;
			}
			else if (userSentence.charAt(i) == 'u') {
				_vowels[4][0]++;
			}
			else if (userSentence.charAt(i) == 'U') {
				_vowels[4][1]++;
			}
		}
		
	}
	
	public void printSummary() {
		System.out.println("A: lowercase =" + _vowels[0][0] + " uppercase = " + _vowels[0][1] + " Total = " + (_vowels[0][0] + _vowels[0][1]));
		System.out.println("E: lowercase =" + _vowels[1][0] + " uppercase = " + _vowels[1][1] + " Total = " + (_vowels[1][0] + _vowels[1][1]));
		System.out.println("I: lowercase =" + _vowels[2][0] + " uppercase = " + _vowels[2][1] + " Total = " + (_vowels[2][0] + _vowels[2][1]));
		System.out.println("O: lowercase =" + _vowels[3][0] + " uppercase = " + _vowels[3][1] + " Total = " + (_vowels[3][0] + _vowels[3][1]));
		System.out.println("U: lowercase =" + _vowels[4][0] + " uppercase = " + _vowels[4][1] + " Total = " + (_vowels[4][0] + _vowels[4][1]));
	}
	
	
	
	
	

	
	
	
	
}
