import java.util.Arrays;
import java.util.Scanner;

/**
 * InterceptedInputs
 */
public class InterceptedInputs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCases = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < testCases; i++) {
			int k = Integer.parseInt(scanner.nextLine());
			String[] numbers = scanner.nextLine().split(" ");

			int[] freq = new int[k + 1];
			for (String numStr : numbers) {
				int num = Integer.parseInt(numStr);
				freq[num]++;
			}

			System.out.println(Arrays.toString(freq));
			int a = -1, b = -1;
			for (int j = 1; j <= k; j++) {
				if (j * j == k - 2 && freq[j] > 1) {
					a = b = j;
					break;
				} else if ((k - 2) % j == 0 && freq[j] > 0 && freq[(k - 2) / j] > 0) {
					a = j;
					b = (k - 2) / j;
					break;
				}
			}

			System.out.println(a + " " + b);
		}

		scanner.close();
	}
}
