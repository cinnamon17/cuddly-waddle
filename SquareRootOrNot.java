import java.util.Scanner;

/**
 * SquareRootOrNot
 */
public class SquareRootOrNot {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());

		for (int j = 0; j < testCases; j++) {

			Integer length = Integer.valueOf(scanner.nextLine());
			String beatifullMatrix = scanner.nextLine();
			Integer id = 0;

			while (id < length && beatifullMatrix.charAt(id) == '1') {
				id++;
			}

			if (id == length) {

				if (id == 4) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {

				if ((id - 1) * (id - 1) == length) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		}
		scanner.close();

	}

}
