import java.util.Scanner;

/**
 * Hulk
 */
public class Hulk {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer emotions = scanner.nextInt();
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < emotions; i++) {

			if (i % 2 == 0) {
				str.append("I hate ");
			} else {
				str.append("I love ");
			}

			if (i < emotions - 1) {
				str.append("that ");
			} else {
				str.append("it");
			}
		}

		System.out.println(str.toString());
		scanner.close();

	}
}
