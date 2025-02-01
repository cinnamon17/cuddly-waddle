import java.util.Scanner;

/**
 * GameOfMathletes
 */
public class GameOfMathletes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();

			int[] freq = new int[n + 1];
			int score = 0;

			for (int i = 0; i < n; i++) {
				int num = scanner.nextInt();
				freq[num]++;
			}

			for (int i = 1; i <= n; i++) {

				if (freq[i] == 0) {
					continue;
				}

				int b = k - i;

				if (b >= 1 && b <= n && freq[b] > 0) {
					if (i == b) {
						score += freq[i] / 2;
					} else {

						score += Math.min(freq[i], freq[b]);
					}

					freq[b] = 0;
				}
			}
			System.out.println(score);
		}

		scanner.close();

	}
}
