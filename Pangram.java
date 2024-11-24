import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Pangram
 */
public class Pangram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer letters = Integer.valueOf(scanner.nextLine());
		String str = scanner.nextLine().toLowerCase();
		Map<Character, Integer> dictionary = new HashMap<>();

		for (int i = 0; i < letters; i++) {
			dictionary.putIfAbsent(str.charAt(i), 1);
		}
		if (dictionary.size() >= 26) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scanner.close();
	}
}
