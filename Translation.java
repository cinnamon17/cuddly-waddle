import java.util.Scanner;

/**
 * Translation
 */
public class Translation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String first = scanner.nextLine();
		String second = scanner.nextLine();
		StringBuffer reversedFirst = new StringBuffer();

		for (int i = first.length() - 1; i >= 0; i--) {
			reversedFirst.append(first.charAt(i));
		}

		if (String.valueOf(reversedFirst).equals(second)) {
			;
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scanner.close();
	}
}
