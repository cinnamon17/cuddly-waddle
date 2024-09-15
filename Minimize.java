import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Minimize
 */
public class Minimize {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());

		for (int i = 0; i < testCases; i++) {

			StringTokenizer st = new StringTokenizer(scanner.nextLine());

			if (st.hasMoreTokens()) {

				Integer a = Integer.valueOf(st.nextToken());
				Integer b = Integer.valueOf(st.nextToken());

				System.out.println((1 - a) + (b - 1));

			}
		}

		scanner.close();
	}

}
