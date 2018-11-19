package Chapter5Assignment;
import java.util.Scanner;
/*
 * Caleb Mouritsen
 * 11/13/18
 *  this program will prompt the user to enter a hex number and will convert it to binary
 */
public class HexToBinary {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		//initialize variables, prompt user input
	System.out.println("Enter a hex digit");
	int iHex = input.nextInt();
	
	String bin = "";
	bin = Integer.toBinaryString(iHex);
	
	System.out.println(iHex + " in binary is " + bin);

	}

}
