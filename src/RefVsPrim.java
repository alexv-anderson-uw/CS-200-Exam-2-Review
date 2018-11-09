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
 *     refers to (see below for examples).
 * 
 * @author Alex
 */

import java.util.Arrays;

public class RefVsPrim {

	public static void main(String[] args) {

		/* ** References for wrapper classes are affected by auto-boxing ** */
		
		int x = 1;
		System.out.println("x = " + x);
		
		Integer a;
		a = x;
		System.out.println("a = " + a);
		Integer b = a;
		a++;	//Note: this only affects a because of auto-unboxing
		System.out.println("a = " + a + " b = " + b);
		
		/* ** References to immutable data ** */
		
		String original = "hello";
		String copy = original;
		copy = copy + ", world";
		System.out.println("Original:\t" + original);
		System.out.println("Copy:\t" + copy);
		
		/* ** References to mutable data ** */
		
		int[] array1 = new int[5];
		int[] array2 = array1;
		array2[3] = -1;
		System.out.println(Arrays.toString(array1));
	}
}
