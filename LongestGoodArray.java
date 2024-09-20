import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * LongestGoodArray
 */
public class LongestGoodArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());

		for (int i = 0; i < testCases; i++) {

			StringTokenizer StringTokenizer = new StringTokenizer(scanner.nextLine());

			if (StringTokenizer.hasMoreTokens()) {
				Long a = Long.valueOf(StringTokenizer.nextToken());
				Long b = Long.valueOf(StringTokenizer.nextToken());

				Long l = 2l;
				Long r = 1000000000l;

				b -= a;
				while (l < r) {

					Long m = (l + r) / 2;

					if (m * (m - 1) / 2 <= b) {
						l = m + 1;
					} else {
						r = m;
					}
				}

				System.out.println(l - 1);
			}

		}
		scanner.close();

	}

}
