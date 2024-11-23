import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * DivisibilityProblem
 */
public class DivisibilityProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());
		Integer a = 0;
		Integer b = 0;

		for (int i = 0; i < testCases; i++) {
			StringTokenizer st = new StringTokenizer(scanner.nextLine());

			if (st.hasMoreTokens()) {
				a = Integer.valueOf(st.nextToken());
				b = Integer.valueOf(st.nextToken());

				if (a % b == 0) {
					System.out.println(0);
				} else {
					System.out.println(b - a % b);
				}
			}
		}
		scanner.close();
	}
}
