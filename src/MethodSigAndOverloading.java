
/**
 * Hulk smashes numbers to demonstrate Method Signatures and Overloading
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
}
