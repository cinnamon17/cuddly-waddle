import java.util.Scanner;

/**
 * FoxAndSnake
 */
public class FoxAndSnake {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		StringBuilder str = new StringBuilder();
		StringBuilder tail = new StringBuilder();

		for (int j = 0; j < m - 1; j++) {
			tail.append(".");
		}
		tail.append("#");

		for (int j = 0; j < m; j++) {
			str.append("#");
		}

		for (int i = 1; i < n + 1; i++) {

			if (i % 2 != 0) {
				System.out.println(str);
			} else {

				if (i > 2) {
					tail.reverse();
				}
				System.out.println(tail);
			}

		}
		scanner.close();
	}
}
