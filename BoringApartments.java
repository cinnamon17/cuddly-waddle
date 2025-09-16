import java.util.Scanner;

/**
 * BoringApartments
 */
public class BoringApartments {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		scanner.nextLine();

		while (testCases--> 0) {
		    String str = scanner.nextLine();
		    int n = Character.getNumericValue(str.charAt(0));
		    int counter = 0;

		    for (int i = 1; i < n; i++) {
			counter += 10;
		    }

		    for (int i = 0; i < str.length(); i++) {
			counter += i + 1;
		    }

		    System.out.println(counter);

		}

		scanner.close();
	}
}
