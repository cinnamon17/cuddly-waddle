import java.util.HashMap;
import java.util.Scanner;

/**
 * BeautifulYear
 */
public class BeautifulYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer year = Integer.valueOf(scanner.nextLine());

		while (true) {

			Boolean unique = true;
			year++;
			HashMap<Character, Integer> values = new HashMap<>();
			for (int i = 0; i < 4; i++) {
				String str = String.valueOf(year);
				Character ch = str.charAt(i);
				if (values.containsKey(ch)) {
					unique = false;
					break;
				}
				values.put(ch, 1);
			}

			if (unique) {
				System.out.println(year);
				break;
			}
		}
		scanner.close();
	}
}
