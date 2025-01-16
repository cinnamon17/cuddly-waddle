import java.util.Scanner;

/**
 * SumOfRoundNumbers
 */
public class SumOfRoundNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < testCase; i++) {
			String digit = scanner.nextLine();
			int length = 0;
			int temp = 0;
			StringBuilder str = new StringBuilder();

			for (int j = 0; j < digit.length(); j++) {
				if (digit.charAt(j) != '0') {
					length++;

					str.append(digit.charAt(j));
					temp++;
					for (int k = 0; k < digit.length() - temp; k++) {
						str.append("0");
					}
					str.append(" ");
				} else {
					temp++;
				}
			}

			System.out.println(length);
			System.out.println(str);

		}

		scanner.close();
	}
}
