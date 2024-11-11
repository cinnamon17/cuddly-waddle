import java.util.Scanner;

/**
 * Word
 */
public class Word {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		Integer upper = 0;
		Integer lower = 0;

		for (int i = 0; i < word.length(); i++) {

			if (Character.isUpperCase(word.charAt(i))) {
				upper++;
			} else {
				lower++;
			}
		}
		scanner.close();
		if (upper > lower) {
			System.out.println(word.toUpperCase());
		} else {
			System.out.println(word.toLowerCase());
		}
	}

}
