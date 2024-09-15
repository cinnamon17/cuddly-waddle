import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Team
 */
public final class Team {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int sum = 0;

		for (int i = 0; i <= rows; i++) {

			StringTokenizer st = new StringTokenizer(scanner.nextLine());
			if (st.hasMoreTokens()) {

				int pivot = Integer.valueOf(st.nextToken()) + Integer.valueOf(st.nextToken())
						+ Integer.valueOf(st.nextToken());

				if (pivot > 1) {
					sum += 1;
				}
			}
		}

		scanner.close();
		System.out.println(sum);
	}
}
