import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * AntonAndLetters
 */
public class AntonAndLetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		Set<Character> letters = new HashSet<>();

		for (int i = 0; i < row.length(); i++) {

			if (Character.isLetter(row.charAt(i))) {
				letters.add(row.charAt(i));
			}
		}

		System.out.println(letters.size());
		scanner.close();
	}
}
