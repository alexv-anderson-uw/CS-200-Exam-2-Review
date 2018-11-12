/**
 * Creating, accessing, and mutating multi-dimensional arrays
 * 
 * @author TJ
 */

public class MultiDimArrays {

	// Print a well-formatted array
	public static void printArray(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; ++i) {
			System.out.print(array[i]);
			
			// If this wasn't the last loop iteration, add a comma
			if (i < array.length - 1)
				System.out.print(", ");
		}
		System.out.print("}");
	}
	
	// Print a well-formatted 2-d array
	public static void print2dArray(int[][] array) {
		System.out.println("{");
		for (int i = 0; i < array.length; ++i) {
			// Indent
			System.out.print("  ");
			printArray(array[i]);
			
			// If this wasn't the last loop iteration, add a comma
			if (i < array.length - 1)
				System.out.println(", ");
			else
				System.out.println();
		}
		System.out.println("}");
	}
	
	public static void reverseRows(int[][] array) {
		int[] temp;
		// Loop over half the rows
		for (int i = 0; i < array.length/2; ++i) {
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
	}
	
	public static void reverseColumns(int[][] array) {
		int temp;
		// Loop over the rows
		for (int i = 0; i < array.length; ++i) {
			// Loop over half the columns in the row
			for (int j = 0; j < array[i].length/2; ++j) {
				temp = array[i][j];
				array[i][j] = array[i][array[i].length - j - 1];
				array[i][array[i].length - j - 1] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] array = {
			{1, 2, 3, 4, 5},
			{5, 4, 3, 2, 1},
			{0, 0, 0, 5, 0, 0, 0},
			{4, 5, 6, 7, 8, 9},
			{}
		};
		
		System.out.println("Original array");
		print2dArray(array);
		
		System.out.println("array with reversed rows");
		reverseRows(array);
		print2dArray(array);
		// Re-reverse the rows to restore the Original
		reverseRows(array);
		
		System.out.println("array with reversed columns");
		reverseColumns(array);
		print2dArray(array);
		
		System.out.println("array with reversed rows and columns");
		reverseRows(array);
		print2dArray(array);
	}
}
