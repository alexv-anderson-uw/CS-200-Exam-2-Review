import java.util.Arrays;

/**
 * References vs Primitives
 * 
 * Primitives: Primitive data types are the data types which represent numbers,
 *     characters, and true/false values (notice how strings are not included).
 *     Variables with a primitive data type are stored on the stack, so their
 *     values cannot be accessed by other methods.
 *     
 * References: If a data type is not primitive, then it is a reference data type.
 *     References are variables on the stack which "refer" to data that is stored
 *     on the heap. Since the data is stored on the heap, the data can be accessed
 *     and/or affected by other methods who also have a reference to that location
 *     in memory. How a reference variable behaves depends on the data that it
 *     refers to (see below for examples)
 * 
 * @author Alex
 */
public class RefVsPrim {

	/**
	 * Demonstrates how reference variables behave based on the data to which
	 *     they refer.
	 * @param args An array of command line arguments
	 */
	public static void main(String[] args) {

		/* ** References for wrapper classes are affected by auto-boxing ** */
		
		System.out.println("References to primitive wrappers");
		
		int integerPrimitive = 1;
		System.out.println("primitive = " + integerPrimitive);
		
		Integer integerRefernce1;
		integerRefernce1 = integerPrimitive;
		System.out.println("reference1 = " + integerRefernce1);
		Integer integerReference2 = integerRefernce1;
		integerRefernce1++;	//Note: this only affects integerRefernce1 because of auto-unboxing
		System.out.println("reference1 = " + integerRefernce1 + " reference2 = " + integerReference2);
		
		/* ** References to immutable data ** */
		
		System.out.println();
		System.out.println("References to immutable data");
		
		String originalReference = "hello";
		String otherReference = originalReference;
		otherReference = otherReference + ", world";
		System.out.println("Original:\t" + originalReference);
		System.out.println("Other:\t\t" + otherReference);
		
		/* ** References to mutable data ** */
		
		System.out.println();
		System.out.println("References to mutable data");
		
		int[] array1 = new int[5];
		int[] array2 = array1;
		array2[3] = -1;
		System.out.println(Arrays.toString(array1));
	}
}
