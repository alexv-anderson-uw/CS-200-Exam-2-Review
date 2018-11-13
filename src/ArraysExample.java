/**
 * Suggestion: Stick to 1-D arrays. Creation, initialization, mutation.
 * 
 * @author Ray
 */
import java.util.Arrays;
public class ArraysExample {

	public static void main(String[] args) {
		String names[] = {"Woody", "Buzz", "Mr Potato Head", "Andy"};
		int ages[] = {2, 1, 4, 3};
		//Change int arrays
		fastForward(ages);
		System.out.println(Arrays.toString(ages));
		goBack(ages);
		System.out.println(Arrays.toString(ages));
		
		//String arrays
		//Are the two elements equal?
		String newNames[] = copyNames(names);
		if (newNames[0] == names[0]) {
			System.out.println(newNames[0] + " == " + names[0]);
		}
		else {
			System.out.println(newNames[0]  + " does NOT == " + names[0]);
		}
		//Make it capitalized
		//Are they equal now?
		newNames[1] = newNames[1].toUpperCase();
		if (newNames[1] == names[1]) {
			System.out.println(newNames[1] + " == " + names[1]);
		}
		else {
			System.out.println(newNames[1]  + " does NOT == " + names[1]);
		}
		
	}
	//Increments all elements in ages by 10?
	public static int[] fastForward(int[] ages) {
		for (int i = 0; i < ages.length; i++) {
			ages[i] += 10;
		}
		return ages;
	}
	//Decrements all elements in ages by 10?
	public static int[] goBack(int[] ages) {
		int newAges[] = new int[ages.length];
		for (int i = 0; i < newAges.length; i++) {
			newAges[i] = ages[i] - 10;
		}
		return newAges;
	}
	//creates a copy of names and returns it
	public static String[] copyNames(String[] names) {
		String[] newNames = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			newNames[i] = names[i];
		}
		return newNames;
	}
}
