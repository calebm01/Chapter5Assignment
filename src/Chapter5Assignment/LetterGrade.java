package Chapter5Assignment;
import java.util.Scanner;
/*
 * Caleb Mouritsen
 * 11/15/18
 * Program that takes a letter grade and displays its corresponding numeric value
 */

public class LetterGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//initialize variables prompt user input
		System.out.println("Enter your letter grade");
		char grade = input.nextLine().charAt(0);
		
		// allowing user to input different grades
			if (grade == 'A') {
			System.out.println("The numeric value for A is 4.0");
			
		}
			else if (grade == 'B') {
				System.out.println("The numeric value for B is 3.0");
			}
			else if (grade == 'C') {
				System.out.println("The numeric value for C is 2.0");
			}
			else if (grade == 'D') {
				System.out.println("The numeric value for D is 1.0");
			}
			else if (grade == 'F') {
				System.out.println("The numeric value for F is 0.0");
			}
			
		else {
			System.out.println("grade needs to be a single letter and needs to be A, B, C, D, or F \nrerun the program");
			
			
		}
			
		}

	}



