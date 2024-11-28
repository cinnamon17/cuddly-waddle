import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Startup
 */
public class Startup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCase = Integer.valueOf(scanner.nextLine());

		for (int i = 0; i < testCase; i++) {

			String row = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(row);
			Integer earnings = 0;

			if (st.hasMoreTokens()) {
				Integer shelves = Integer.valueOf(st.nextToken());
				Integer bottles = Integer.valueOf(st.nextToken());
				Integer[] prices = new Integer[bottles];

				if (shelves >= bottles) {
					for (int j = 0; j < bottles; j++) {
						String innerRow = scanner.nextLine();
						StringTokenizer stInner = new StringTokenizer(innerRow);
						if (stInner.hasMoreTokens()) {
							Integer brand = Integer.valueOf(stInner.nextToken());
							Integer price = Integer.valueOf(stInner.nextToken());
							earnings += price;
						}
					}

				} else {
					for (int j = 0; j < bottles; j++) {
						String innerRow = scanner.nextLine();
						StringTokenizer stInner = new StringTokenizer(innerRow);

						if (stInner.hasMoreTokens()) {
							Integer brand = Integer.valueOf(stInner.nextToken());
							Integer price = Integer.valueOf(stInner.nextToken());
							prices[j] = price;
						}
					}
					Arrays.sort(prices);

					for (int j = 0; j < shelves; j++) {
						earnings += prices[j + prices.length - 1];
						// System.out.println(prices[j + prices.length - 1]);
					}
				}
				System.out.println(earnings);
			}

		}

		scanner.close();
	}
}
