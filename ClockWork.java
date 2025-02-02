import java.util.Scanner;

/**
 * ClockWork
 */
public class ClockWork {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases-- > 0) {
			int clocks = scanner.nextInt();
			boolean isInfinite = false;

			for (int i = 0; i < clocks; i++) {
				int clock = scanner.nextInt();

				if (clock <= Math.max(2 * (clocks - 1 - i), 2 * i)) {
					System.out.println("NO");
					break;
				} else {
					isInfinite = true;
					System.out.println("YES");
				}
			}

		}
		scanner.close();
	}
}
