import java.util.Scanner;

/**
 * NormalProblem
 */
public class NormalProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());

		for (int i = 0; i < testCases; i++) {
			String str = scanner.nextLine();
			StringBuilder reversedStr = new StringBuilder();

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(j) == 'p') {
					reversedStr.append('q');
				} else if (str.charAt(j) == 'q') {
					reversedStr.append('p');
				} else {
					reversedStr.append(str.charAt(j));
				}

			}
			reversedStr.reverse();
			System.out.println(reversedStr);
		}

		scanner.close();
	}
}
