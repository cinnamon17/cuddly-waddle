import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * WrongSubstraction
 */
public class WrongSubstraction {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(row);
		String number = "";
		Integer times = 0;

		if (st.hasMoreTokens()) {
			number = st.nextToken();
			times = Integer.valueOf(st.nextToken());

			for (int i = 0; i < times; i++) {
				if (Character.valueOf(number.charAt(number.length() - 1)).equals('0')) {
					number = String.valueOf((Integer.valueOf(number) / 10));
				} else {
					number = String.valueOf((Integer.valueOf(number) - 1));
				}
			}

		}

		scanner.close();
		System.out.println(number);
	}
}
