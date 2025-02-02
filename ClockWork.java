import java.util.Arrays;
import java.util.Scanner;

/**
 * ClockWork
 */
public class ClockWork {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases-- > 0) {
			int numClocks = scanner.nextInt();
			scanner.nextLine();
			String[] clocks = scanner.nextLine().split(" ");
			boolean isInfinite = true;

			for (int i = 0; i < numClocks; i++) {
				if (Integer.parseInt(clocks[i]) <= Math.max(2 * (numClocks - 1 - i), 2 * i)) {
					isInfinite = false;
					break;
				}
			}

			if (isInfinite) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
		scanner.close();
	}
}
