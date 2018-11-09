/**
 * Topic - Casting
 * 
 * Casting has two forms in Java: Down-casting and up-casting.
 * 
 * Down-casting: Down-casting is the when a value is taken from a larger
 *     more precise type an placed in a smaller less precise type. Due to
 *     the loss of precision, Java requires that the program explicitly
 *     request that the value be cast to ensure that information is not
 *     accidentally lost.
 *     
 * Up-casting: Up-casting occurs when a value is taken from a smaller, less
 *     precise type and placed in a larger, more precise type. Since no
 *     precision can be lost, Java does not require the program to explicitly
 *     request that the value be cast; therefore, these casts are also called
 *     implicit casts.
 * 
 * @author Alex
 */

public class Casting {

	public static void main(String[] args) {
		
		/* ** Explicitly down-casting types ** */
		
		System.out.println("Explicitly casting down from larger types");
		System.out.println(1.0);		// Value's type is double and a double is printed
		System.out.println((int) 1.0);	// Value's type is double but an int is printed
		
		/* ** Implicitly converting types ** */
		
		System.out.println();
		
		System.out.println("Implicit casting affects expression's data type");
		System.out.println(1 + 1);		// The expression's type is int
		System.out.println(1 + 1.0);	// The expression's type is double
		
		System.out.println();
		
		System.out.println("Implicit casting affects value of an expression");
		System.out.println(3 / 2);		// Result = 1
		System.out.println(3 / 2.0);	// Result = 1.5
		
		/* ** Order of operations affects when casting happens  ** */
		
		System.out.println();
		
		System.out.println("Order of operations affects casting");
		System.out.println(1 + 2 + "hello" + 4 + 5);		// Result = 3hello45
		System.out.println( 1 + (2 + "hello") + 4 + 5 );	// Result = 12hello45
		System.out.println( 1 + (2 + "hello") + (4 + 5) );	// Result = 12hello9
	}
}
