import java.util.Scanner;

/**
 * HardProblem
 */
public class HardProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = scanner.nextInt();

		for (int i = 0; i < testCases; i++) {
			Integer m = scanner.nextInt();
			Integer a = scanner.nextInt();
			Integer b = scanner.nextInt();
			Integer c = scanner.nextInt();

			a = Math.min(a, m);
			b = Math.min(b, m);

			System.out.println(Math.min(2 * m, a + b + c));

		}

		scanner.close();
	}
}
