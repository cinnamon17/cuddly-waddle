import java.util.HashMap;
import java.util.Scanner;

/**
 * BoyOrGirl
 */
public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		HashMap<Character, Integer> chars = new HashMap<>();
		for (int i = 0; i < row.length(); i++) {
			chars.put(row.charAt(i), 1);
		}

		if (chars.size() % 2 == 0) {

			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}
		scanner.close();
	}
}
