import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * SakurakoExam
 */
public class SakurakoExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());

		for (int i = 0; i < testCases; i++) {
			StringTokenizer st = new StringTokenizer(scanner.nextLine());

			if (st.hasMoreTokens()) {
				Integer a = Integer.valueOf(st.nextToken());
				Integer b = Integer.valueOf(st.nextToken());

				if (a % 2 != 0) {
					System.out.println("NO");
				} else {

					if (b % 2 == 0) {
						System.out.println("YES");
					} else {

						if (a == 0) {

							System.out.println("NO");

						} else {
							System.out.println("YES");
						}

					}
				}
			}
		}

		scanner.close();

	}
}
