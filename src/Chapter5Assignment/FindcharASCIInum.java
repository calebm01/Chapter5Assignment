package Chapter5Assignment;
import java.util.Scanner;

/*
 * Caleb Mouritsen
 * 11/1/18
 * Program that takes a character input from the user and converts it to the ASCII code and tells the user
 * what the ASCII code is for the character that was input.
 */

public class FindcharASCIInum {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//initialize variables and prompt user to enter a character
		System.out.println("Enter a single character to see what its ASCII code is \n(If you input more than one character, the first character will be used)");
		char ASCIIChar = input.nextLine().charAt(0);
		
		int x = (int)ASCIIChar;
		
		System.out.println(ASCIIChar + " As a number is " + x + "");
		
		
			
		
		

	}

}
