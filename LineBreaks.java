import java.util.Scanner;

/**
 * LineBreaks
 */
public class LineBreaks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.nextLine());

		for (int t = 0; t < testCases; t++) {
			String[] nm = scanner.nextLine().split(" ");
			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);

			int ans = 0;
			for (int i = 0; i < n; i++) {
				String line = scanner.nextLine();
				if (line.length() <= m) {
					m -= line.length();
					ans++;
				} else {
					// Skip remaining lines for this test case
					for (int j = i + 1; j < n; j++) {
						scanner.nextLine();
					}
					break;
				}
			}

			System.out.println(ans);
		}

		scanner.close();
	}
}
