/**
 * Command Line Arguments
 * 
 * Command line arguments are given to the program at the moment it
 *     is executed. The arguments come from the JVM which gets them
 *     from the command used to start the program.
 * 
 * @author Alex
 */
import java.util.Arrays;

public class CMArguments {

	/**
	 * Demonstrates how command line arguements can be accessed.
	 * @param args An array of command line arguments
	 */
	public static void main(String[] args) {
		
		//Note: the args parameter is empty if no parameters are given
		if(args.length == 0)
		{
			System.out.println("No command line arguments were passed");
		}
		else
		{
			System.out.println(args.length + " command line arguments were passed");
			System.out.println(Arrays.toString(args));
		}
	}
}
