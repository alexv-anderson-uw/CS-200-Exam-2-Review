import java.util.Arrays;

/**
 * Mutable vs. Immutable Memory
 * 
 * Mutable Memory: Memory which is mutable is memory whose value can change.
 *     An example of mutable memory would be arrays.
 * 
 * Immutable Memory: Memory which is immutable is memory whose value cannot
 *     change. An example of immutable memory are Strings
 * 
 * @author Alex
 */
public class MutableVsImmutable {

	/**
	 * Successfully changes the contents of the array given to it.
	 * @param originalArray The array to be changed
	 * @param newChar       The character to use when changing the array
	 */
	public static void changeArrayContents(char[] originalArray, char newChar) {
		for(int i = 0; i < originalArray.length; i++) {
			originalArray[i] = newChar;
		}
	}
	
	/**
	 * Unsuccessfully attempts to change the array.
	 * @param originalArray The array to be changed
	 * @param newChar       The character to use when changing the array
	 */
	public static void changeArray(char[] originalArray, char newChar) {
		char[] newArray = new char[originalArray.length];
		
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = newChar;
		}
		
		originalArray = newArray;
	}

	/**
	 * Unsuccessfully attempts to change the string given to it.
	 * @param originalString The string to change
	 * @param newString      The string to change the original string to
	 */
	public static void changeString(String originalString, String newString) {
		originalString = newString;
	}
	
	/**
	 * Demonstrates the difference between mutable and immutable data.
	 * @param args An array of command line arguments
	 */
	public static void main(String[] args) {
		String s = "hello";
		char[] word = {'h', 'e', 'l', 'l', 'o'};
		
		System.out.println("String");
		System.out.println("- Before:\t" + s);
		changeString(s, "world");
		System.out.println("- After:\t" + s);
		
		System.out.println("Array");
		System.out.println("- Original:\t\t" + Arrays.toString(word));
		changeArray(word, 'x');
		System.out.println("- changeArray:\t\t" + Arrays.toString(word));
		changeArrayContents(word, 'x');
		System.out.println("- changeArrayContents:\t" + Arrays.toString(word));
	}
}
