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

import java.util.Arrays;

public class MutableVsImmutable {

	public static void changeArrayContents(char[] originalArray, char newChar) {
		for(int i = 0; i < originalArray.length; i++) {
			originalArray[i] = newChar;
		}
	}
	
	public static void changeArray(char[] originalArray, char newChar) {
		char[] newArray = new char[originalArray.length];
		
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = newChar;
		}
		
		originalArray = newArray;
	}
	
	public static void changeString(String originalString, String newString) {
		originalString = newString;
	}
	
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
