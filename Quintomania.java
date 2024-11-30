import java.util.Scanner;

/**
 * Quintomania
 */
public class Quintomania {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());

		for (int i = 0; i < testCases; i++) {
			Integer length = Integer.valueOf(scanner.nextLine());
			String[] melodies = scanner.nextLine().split(" ");
			Boolean perfect = false;

			for (int j = 0; j < length - 1; j++) {

				int diff = Math.abs(Integer.valueOf(melodies[j]) - Integer.valueOf(melodies[j + 1]));

				if (diff == 7 || diff == 5) {
					perfect = true;

				} else {
					perfect = false;
					break;
				}
			}
			if (perfect) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		scanner.close();
	}
}
