import java.util.Scanner;

/**
 * Presents
 */
public class Presents {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] permutation = new int[n];
		int[] inversePermutation = new int[n];

		for (int i = 0; i < n; i++) {
			permutation[i] = scanner.nextInt() - 1; // Adjust for 0-based indexing
		}

		for (int i = 0; i < n; i++) {
			inversePermutation[permutation[i]] = i + 1; // Adjust for 1-based indexing in output
		}

		for (int i = 0; i < n; i++) {
			System.out.print(inversePermutation[i] + " ");
		}
		scanner.close();
		System.out.println();
	}
}
