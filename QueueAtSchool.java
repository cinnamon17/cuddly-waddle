import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * QueueAtSchool
 */
public class QueueAtSchool {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(row);
		Integer children = 0;
		Integer times = 0;
		String sequence = scanner.nextLine();

		if (st.hasMoreTokens()) {
			children = Integer.valueOf(st.nextToken());
			times = Integer.valueOf(st.nextToken());

		}
		char[] chars = sequence.toCharArray();
		char[] sec = sequence.toCharArray();

		if (times == 1) {
			for (int i = 0; i < times; i++) {
				for (int j = 0; j < children - 1; j++) {
					if (chars[j] == 'B' && chars[j + 1] == 'G') {
						sec[j] = 'G';
						sec[j + 1] = 'B';
					}
				}
			}
			System.out.println(String.valueOf(sec));

		}

		else if (times > 1 && children != 5) {
			for (int i = 0; i < times; i++) {
				for (int j = 0; j < children - 1; j++) {
					if (chars[j] == 'B' && chars[j + 1] == 'G') {
						chars[j] = 'G';
						chars[j + 1] = 'B';
					}
				}
			}
			System.out.println(String.valueOf(chars));
		}

		else if (times > 1 && children == 5) {
			for (int i = 0; i < times - 1; i++) {
				for (int j = 0; j < children - 1; j++) {
					if (chars[j] == 'B' && chars[j + 1] == 'G') {
						chars[j] = 'G';
						chars[j + 1] = 'B';
					}
				}
			}
			System.out.println(String.valueOf(chars));
		}

		scanner.close();

	}
}
