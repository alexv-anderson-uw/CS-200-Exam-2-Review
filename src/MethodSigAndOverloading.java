import java.io.IOException;

/**
 * Hulk smashes numbers to demonstrate Method Signatures and Overloading
 * 
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
public class MethodSigAndOverloading {

    /**
     * Hulk smashes a bunch of numbers
     * @param args unused command-line arguments
     */
    public static void main(String[] args) {
        // METHOD SIGNATURES
        // Hulk smashes objects
        System.out.println("Hulk time!\n");
        smash(4.5, "Smash!");
        System.out.println("---"); // Visual separation
        smash(12);
        System.out.println("---");
        smash(7, "Hulk smash!");

        // What happens with these calls?
        // smash(9);
        // smash("Destroy!", 9.0);
        // smash(8.7);
        // smash (3, "Smashy smash");
        // smash("HULLLK SMAAASH");

        // EXCEPTIONS
        // Batman doesn't kill, so if you try to punch an enemy with low health,
        // an exception is thrown

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
     * Yell as we smash a double
     * Repeatedly cut the double in half until it is less than 1
     * @param num The double to smash
     * @param yell The phrase to yell as we smash num
     */
    public static void smash(double num, String yell) {
        System.out.println(num + " " + yell);

        // Repeatedly cut in half until less than 1
        while (num >= 1) {
            num = num / 2;
            System.out.println("Smashed to " + num);
        }
    }

    /**
     * Smash a given integer, yell "Integer smash!" as we do it
     * @param num The integer to smash
     */
    public static void smash(int num) {
        System.out.println("Smashing integer " + num + "!");
        smash(num, "Integer smash!");
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
