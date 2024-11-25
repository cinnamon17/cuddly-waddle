import java.util.Scanner;

/**
 * FixingTheExpresion
 */
public class FixingTheExpresion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());

		for (int i = 0; i < testCases; i++) {

			String row = scanner.nextLine();
			Integer a = Integer.valueOf(String.valueOf(row.charAt(0)));
			Integer b = Integer.valueOf(String.valueOf(row.charAt(2)));

			if (a < b) {
				System.out.println(a + "<" + b);
			} else if (a == b) {
				System.out.println(a + "=" + b);
			} else if (a > b) {
				System.out.println(a + ">" + b);
			}
		}

		scanner.close();
	}
}
