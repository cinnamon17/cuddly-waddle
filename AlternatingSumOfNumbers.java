import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * AlternatingSumOfNumbers
 */
public class AlternatingSumOfNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer numOfTimes = Integer.valueOf(scanner.nextLine());

		for (int j = 0; j < numOfTimes; j++) {

			Integer testCases = Integer.valueOf(scanner.nextLine());
			String row = scanner.nextLine();
			int sum = 0;
			boolean nextShouldBeNegative = false;

			StringTokenizer st = new StringTokenizer(row);

			if (st.hasMoreTokens()) {
				for (int i = 0; i < testCases; i++) {
					if (sum == 0 && testCases == 1) {
						sum = Integer.valueOf(st.nextToken());
						nextShouldBeNegative = true;
					} else {

						if (nextShouldBeNegative) {
							sum = sum - Integer.valueOf(st.nextToken());
							nextShouldBeNegative = false;
						} else {
							sum = sum + Integer.valueOf(st.nextToken());
							nextShouldBeNegative = true;
						}
					}
				}
			}
			System.out.println(sum);
		}
		scanner.close();
	}
}
