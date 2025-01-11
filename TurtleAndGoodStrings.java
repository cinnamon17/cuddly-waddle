import java.util.Scanner;

/**
 * TurtleAndGoodStrings
 */
public class TurtleAndGoodStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());

		for (int i = 0; i < testCases; i++) {

			Integer length = Integer.valueOf(scanner.nextLine());
			String str = scanner.nextLine();

			if (str.charAt(0) == str.charAt(length - 1)) {

				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

		scanner.close();
	}
}
