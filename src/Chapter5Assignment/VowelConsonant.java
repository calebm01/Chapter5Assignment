package Chapter5Assignment;
import java.util.Scanner;
/*
 * Caleb Mouritsen
 * 11/13/18
 * 
 */

public class VowelConsonant {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		// initialize variables and user prompt
	System.out.println("Enter a letter");
	String letter = input.nextLine();
	
	//making sure the user only inputs one character
	if (letter.length() != 1) {
		System.out.println("Only one letter needs to be input \n run the program again");
		System.exit(1);
	}
	char ch = Character.toUpperCase(letter.charAt(0));
	
	//checking if the character the user input is a vowel or consonant
	if (Character.isDigit(ch)) {
		System.out.println("Not looking for numbers \n run the program again");
		System.exit(ch);
		
	}
	else {
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a vowel");
		}
		
		else {
			System.out.println(ch + " is a consonant");
				
			}
		}
	}
	}


