import java.util.Scanner;

/**
 * ShohagLovesMod
 */
public class ShohagLovesMod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = scanner.nextInt();

		for (int i = 0; i < testCases; i++) {

			Integer number = scanner.nextInt();

			for (int j = 1; j <= number; j++) {
				System.out.print(2 * j - 1 + " ");
			}
			System.out.println(" ");
		}

		scanner.close();
	}
}
