import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Twice
 */
public class Twice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());

		for (int i = 0; i < testCases; i++) {
			Integer length = Integer.valueOf(scanner.nextLine());
			int counter = 0;
			int[] freq = new int[length + 1];
			String row = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(row);

			for (int j = 0; j < length; j++) {

				if (st.hasMoreTokens()) {
					Integer n = Integer.valueOf(st.nextToken());
					freq[n]++;
				}
			}
			for (int j = 0; j < freq.length; j++) {

				if (freq[j] % 2 == 0 && freq[j] > 1) {
					counter += freq[j] / 2;
				} else {
					counter += (freq[j] - 1) / 2;
				}
			}
			System.out.println(counter);
		}

		scanner.close();
	}
}
