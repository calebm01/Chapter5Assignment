package Chapter5Assignment;
import java.util.Scanner;
import static java.lang.System.out;

/*
 * Caleb Mouritsen
 * 10/30/18
 * Program that takes input for an ASCII Code and gives the character based on the input
 * 
 * use char x = input.next().charAt(0) to get input for a character (used in a later program)
 */

public class FIndASCIIChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//initialize variables and ask the user for ASCII Code input
		System.out.println("Enter the ASCII code (number between 0 and 127) to get its respective character ");
		int ASCII = input.nextInt();
		
		if (ASCII <= 127 && ASCII >= 0) {
			char x = (char)ASCII;
			
			System.out.println(ASCII + " As a character is " + x + " (Based on unicode)");
			
		}
		else {
			System.out.println("You need to input a number within the respective range \nrun the program again");
		}
		
		
		
		
		
		
		

	}

}
