package Chapter5Assignment;
import java.util.Scanner;
/*
 * Caleb Mouritsen 
 * 11/7/18
 * Program that converts hex digits to decimals
 */

public class HexDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a hex digit 0-9 or A-F");
		String hexString = input.nextLine();
		
		int value1 = 0;
		int value2 = 0;
		int value3 = 0;
		
		if (hexString.length() != 3) {
			System.out.println("You must enter exactly three characters");
			System.exit(3);
		}
		char ch = Character.toUpperCase(hexString.charAt(0));
		char ch2 = Character.toUpperCase(hexString.charAt(1));
		char ch3 = Character.toUpperCase(hexString.charAt(2));
		if (ch <= 'F' && ch>='A') {
			int value = ch - 'A' + 10;
			System.out.println("The decimal value for hex digit " + ch + " is " + value);
		}
		else if (Character.isDigit(ch)) {
			System.out.println("The decimal value for hex digit " + ch + " is " + ch);
		}
		else {
			System.out.println(ch + " is an invalid input");
		}
		if (ch2 <= 'F' && ch2>='A') {
			int value = ch2 - 'A' + 10;
			System.out.println("The decimal value for hex digit " + ch2 + " is " + value2);
		}
		else if (Character.isDigit(ch2)) {
			System.out.println("The decimal value for hex digit " + ch2 + " is " + ch2);
		}
		else {
			System.out.println(ch + " is an invalid input");
		}
		if (ch3 <= 'F' && ch3>='A') {
			int value = ch3 - 'A' + 10;
			System.out.println("The decimal value for hex digit " + ch3 + " is " + value3);
		}
		else if (Character.isDigit(ch3)) {
			System.out.println("The decimal value for hex digit " + ch3 + " is " + ch3);
		}
		else {
			System.out.println(ch3 + " is an invalid input");
		}

	}

}
