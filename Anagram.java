import java.util.Scanner;

/**
 * Anagram
 */
public class Anagram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String entry = scanner.nextLine();
		String toCompare = scanner.nextLine();

		Integer[] sumOfEntry = new Integer[entry.length()];
		Integer[] sumToCompare = new Integer[toCompare.length()];
		sumOfEntry[0] = 0;
		sumToCompare[0] = 0;

		if (entry.length() != toCompare.length()) {
			System.out.println("Is not an anagram");
		} else {
			for (int i = 0; i < entry.length(); i++) {
				sumOfEntry[0] += (int) entry.charAt(i);
				sumToCompare[0] += (int) toCompare.charAt(i);
			}

			if (sumOfEntry[0].equals(sumToCompare[0])) {
				System.out.println("YES! is an anagram");
			} else {

				System.out.println("Is not an anagram");
			}

		}
		scanner.close();
	}
}
