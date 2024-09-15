import java.util.Scanner;

/**
 * TooLongWords
 */
public final class TooLongWords {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfWords = scanner.nextInt();

		for (int i = 0; i < numberOfWords; i++) {

			if (scanner.hasNextLine()) {
				String input = scanner.next();
				String start = String.valueOf(input.charAt(0));
				String end = String.valueOf(input.charAt(input.length() - 1));
				int abbreviation = input.length() - 2;

				if (input.length() > 10) {
					System.out.println(start + abbreviation + end);
				} else {
					System.out.println(input);
				}
			}
		}
		scanner.close();
	}
}
