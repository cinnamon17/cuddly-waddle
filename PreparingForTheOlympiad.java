import java.util.Scanner;

/**
 * PreparingForTheOlympiad
 */
public class PreparingForTheOlympiad {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}

			for (int i = 0; i < n; i++) {
				b[i] = scanner.nextInt();
			}

			int ans = a[n - 1];

			for (int i = 0; i < n - 1; i++) {
				ans += Math.max(0, a[i] - b[i + 1]);
			}

			System.out.println(ans);
		}
		scanner.close();
	}

}
