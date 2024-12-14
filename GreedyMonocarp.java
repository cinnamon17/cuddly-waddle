import java.util.Arrays;
import java.util.Scanner;

/**
 * GreedyMonocarp
 */
public class GreedyMonocarp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		for (int i = 0; i < testCases; i++) {
			int chests = scanner.nextInt();
			int total = scanner.nextInt();
			int[] totalChests = new int[chests];
			int sum = 0;

			for (int j = 0; j < chests; j++) {
				int chest = scanner.nextInt();
				totalChests[j] = chest;
			}
			Arrays.sort(totalChests);

			for (int j = totalChests.length - 1; j >= 0; j--) {
				int chest = totalChests[j];

				if (sum + chest <= total) {
					sum += chest;
				} else {
					break;
				}
			}
			System.out.println(total - sum);
		}

		scanner.close();
	}
}
