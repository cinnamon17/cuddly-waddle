import java.util.Scanner;

/**
 * BoyOrGirl
 */
public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < row.length(); i++) {
			if (str.indexOf(String.valueOf(row.charAt(i))) == -1) {
				str.append(row.charAt(i));
			}
		}

		if (str.length() % 2 == 0) {

			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}
		scanner.close();

	}
}
