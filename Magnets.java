import java.util.Scanner;

/**
 * Magnets
 */
public class Magnets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer magnets = scanner.nextInt();
		Integer beforeMagnet = 0;
		Integer counter = 0;

		for (int i = 0; i < magnets; i++) {
			Integer actualValue = scanner.nextInt();
			if (actualValue != beforeMagnet) {
				beforeMagnet = actualValue;
				counter++;
			}
		}

		System.out.println(counter);
		scanner.close();
	}
}
