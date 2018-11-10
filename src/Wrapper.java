/**
 * Suggestion: Series of statements showing when auto-(un)boxing happens
 * 
 * @author Nikhil Kumar
 */
import java.util.ArrayList;

public class Wrapper {

	/**
	 * Will NOT change the value internally in reference.
	 * First and foremost, there is no way to do so; Integer objects
	 * are immutable.
	 * Second, a new Integer object will be created, but the
	 * reference is a COPY of the original reference.
	 */
	public static void testReference(Integer reference) {
		reference = 3;
	}

	/**
	 * This primitive int variable is a copy of the original which
	 * is passed in as an argument.
	 */
	public static void testPrimitive(int primitive) {
		primitive = 3;
	}

	public static void main(String[] args) {

		Integer reference1 = new Integer(5);
		Integer reference2 = reference1;
		Integer reference3 = 4;

		// Auto-unboxing
		if (reference3 == 4) {
			System.out.println("Auto-unboxing happened");
		}

		int primitive = reference3 - 5;
		System.out.println("Auto-unboxing happened");
		System.out.println(primitive);

		// Auto-boxing
		Integer reference4 = 1 + 1;
		System.out.println("Auto-boxing happened");
		System.out.println(reference4);

		// Wrapper classes for these primitives are used for container objects (ex. ArrayList)
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(new Integer(6));
		list.add(reference4);

		System.out.println("Printing List");
		for (Integer x : list) {
			System.out.println(x);
		}

		// Wrapper classes are immutable; you cannot change their state
		int primitive2 = 10;
		testPrimitive(primitive2);
		System.out.println(primitive2);

		Integer reference5 = 10;
		testReference(reference5);
		System.out.println(reference5);
	}
}
