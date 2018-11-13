
/**
 * Suggestion: Demonstrate using and passing a scanner to check user input.
 * 
 * @author Ray
 */
import java.util.Scanner;

public class ScannerExample {
	
	
	public static void main(String[] args) {
		String info = " 23   Linguini\n" + 
					"27 Collette    \n\n" + 
					"   1    Remy ";
		Scanner sc = new Scanner(info);
		String cooks = "-5 \n" +
					   "1005 " +
					   "  5 n\n\n" +
					   "   32\n";
		Scanner sc2 = new Scanner(cooks);
		System.out.print(getInfo(sc));
		System.out.println(howManyCooks(sc2));
	}
	//What string will getInfo return? What does nextInt read? What does it skip? When does it stop?
	public static String getInfo(Scanner sc) {
		String info = "";
		double age = 0;
		String name = "";
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				age = sc.nextInt();
				name = sc.next();
			}
			info += age + name + "\n";
		}
		return info;
	}
	//Does this method work?
	//How could you make it better?
	public static int howManyCooks(Scanner sc) {
		int cooks = 0;
		boolean done = false;
		while (!done) {
			if (sc.hasNextInt()) {
				cooks = sc.nextInt();
			}
			else {
				sc.nextLine();
			}
			if (cooks < 0 || cooks > 1000) {
				done = false;
			}
			sc.nextLine();
			done = true;
		}
		return cooks;
	}
}
