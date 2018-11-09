/**
 * Nested Loops
 * 
 * Nested loops allow us to efficiently apply operations on a nested
 *    structure like 2 dimensional boards. The key is correctly initializing
 *    the index variables and setting the conditions of the for loops
 * 
 * @author Alex
 */

import java.util.Scanner;

public class NestedLoop {

	/**
	 * Demonstrates how nested loops can be used to draw a 2 dimensional
	 *    figure.
	 * @param args An array of command line arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the triangle's height: ");
		if(!scanner.hasNextInt())
		{
			// Don't accept bad input
			System.out.println("Expected a number. Goodbye.");
			return;
		}
		
		int height = scanner.nextInt();
		scanner.nextLine();
		
		for(int rowNum = 0; rowNum < height; rowNum++)	// For each row
		{
			// Note: the program stops once the number of columns exceeds the number of rows
			for(int columnNum = 0; columnNum <= rowNum; columnNum++)  // For each column in the row
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
