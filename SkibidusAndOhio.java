import java.util.Scanner;

/**
 * SkibidusAndOhio
 */
public class SkibidusAndOhio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		scanner.nextLine();

		while (testCases-->0) {
		    String str = scanner.nextLine();
		    boolean reducible = false;

		    for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i+1)) {
			    reducible = true;
			    break;
			}
		    }

		    System.out.println(reducible? "1": str.length());
			
		}



		scanner.close();
	}
}
