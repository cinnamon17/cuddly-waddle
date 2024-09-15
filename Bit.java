import java.util.Scanner;

/**
 * Bit
 */
public class Bit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int lines = scanner.nextInt();

		for (int i = 0; i < lines; i++) {
			if (scanner.hasNext()) {
				String row = scanner.next();

				if (String.valueOf(row).equals(
						String.valueOf("++X"))
						|| String.valueOf(row).equals(String.valueOf("X++"))) {
					num++;
				} else {
					num--;
				}

			}
		}
		scanner.close();

		System.out.println(num);
	}
}
