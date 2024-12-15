import java.util.Scanner;

/**
 * EasyProblem
 */
public class EasyProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = scanner.nextInt();

		for (int i = 0; i < testCases; i++) {

			Integer number = scanner.nextInt();

			System.out.println(number - 1);
		}

		scanner.close();
	}
}
