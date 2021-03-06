
/**
 * Batman punches enemies, but doesn't kill them, to demonstrate exceptions.
 * Exception Handling
 * IOException, InputMismatchException, exception mechanism and messages,
 * exception classes and objects, ArrayIndexOutOfBoundsException and
 * IndexOutOfBoundsException, NullPointerException, ArithmeticException,
 * throwing exceptions (throw statement), catching exceptions (try-catch
 * statement), exception handlers, finally clause, checked vs. unchecked
 * exceptions, checked exceptions and throws clause
 * 
 * @author Mark Wiemer
 */
public class Exceptions {

	/**
	 * Batman doesn't kill, so if you try to punch an enemy with low health,
     * an exception is thrown.
     * @param args unused command-line arguments 
	 */
	public static void main(String[] args) {
		//EXCEPTIONS
        // Is an exception thrown here?
        // Is it caught? If so, where? If not, what happens?
        // */
        System.out.println("\nBatman time!\n");
        int jokerHealth = 10;
        while (jokerHealth > 0) {
            jokerHealth = punch("Joker", jokerHealth);
        }
        // */

        // Is an exception thrown here?
        // Is it caught? If so, where? If not, what happens?
        int baneHealth = 23;
        try {
            while (true) { // punch Bane many times
                baneHealth = punch("Bane", baneHealth);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Bane's health format is wrong");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Arresting Bane");
        } finally {
            System.out
                .println("Batman is done with Bane. Bane only has " + baneHealth + " health left.");
        }

        // Is an exception thrown here?
        // Is it caught? If so, where? If not, what happens?
        int scarecrowHealth = 7;
        try {
            while (true) {
                scarecrowHealth = punch("Scarecrow", scarecrowHealth);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Scarecrow threw a NumberFormatException");
        } finally {
            System.out.println("Scarecrow has " + scarecrowHealth + " health left.");
        }
	}

    /**
     * Punch the given enemy, decreasing its health by 5
     * If its health is less than or equal to 5 throw an exception,
     * because Batman doesn't kill
     * @param name the name of the enemy
     * @param health the health of the enemy
     * @return the enemy's health minus 5
     */
    public static int punch(String name, int health) {
        System.out
            .println("Trying to punch " + name + ", who currently has " + health + " health.");

        if (health <= 0) {
            throw new NumberFormatException("Cannot punch someone who's already dead!");
        }

        if (health > 5) { // if punching does not result in death
            return health - 5;
        } else { // enemy is too weak
            System.out.println(name + " is too weak to punch.");
            System.out.flush(); // Put regular output before error output // TODO remove this line?
            throw new RuntimeException("Batman doesn't kill.");
        }
    }
}
