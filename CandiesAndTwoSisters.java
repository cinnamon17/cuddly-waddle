import java.util.Scanner;

/**
 * CandiesAndTwoSisters
 */
public class CandiesAndTwoSisters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = scanner.nextInt();

		for (int i = 0; i < testCases; i++) {
			System.out.println((scanner.nextInt() - 1) / 2);
		}
		scanner.close();
	}
}
