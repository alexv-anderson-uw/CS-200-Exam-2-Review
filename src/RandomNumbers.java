/**
 * Generating random numbers with and without seeds
 * 
 * @author TJ
 */

import java.util.Random;
 
public class RandomNumbers {

	// Prints the next several ints from the given Random. Ints are generated
	// Between min and max
	public static void printNextRandoms(Random rand, int numRandoms, int min, int max) {
		int next;
		int range;
		for (int i = 0; i < numRandoms; ++i) {
			range = max - min;
			next = rand.nextInt(range) + min;
			System.out.print(next + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// How many random ints to generate
		int count = 10;
		// What's the range of random numbers to generate?
		int min = 1;
		int max = 5;
		
		System.out.println("Generating " + count + " random ints between " + min + " and " + max);
		
		// First let's compare Randoms with no seed
		Random rand1 = new Random();
		Random rand2 = new Random();
		
		System.out.println("No seed: ");
		printNextRandoms(rand1, count, min, max);
		printNextRandoms(rand2, count, min, max);
		System.out.println("Next " + count + " randoms for rand2");
		printNextRandoms(rand2, count, min, max);
		System.out.println();
		
		// Now let's compare Randoms with the same seed
		long seed = 5;
		Random rand3 = new Random(seed);
		Random rand4 = new Random(seed);
		
		System.out.println("Same seed: ");
		printNextRandoms(rand3, count, min, max);
		printNextRandoms(rand4, count, min, max);
		System.out.println();
		
		// And with a different seed
		long otherSeed = 10;
		Random rand5 = new Random(otherSeed);

		System.out.println("Different seed: ");
		printNextRandoms(rand5, count, min, max);
	}
}
