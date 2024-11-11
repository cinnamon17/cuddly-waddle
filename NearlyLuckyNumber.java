import java.util.Scanner;

/**
 * NearlyLuckyNumber
 */
public class NearlyLuckyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		Integer luckyNumbers = 0;

		for (int i = 0; i < row.length(); i++) {
			if (Character.valueOf(row.charAt(i)).equals('4')
					|| Character.valueOf(row.charAt(i)).equals('7')) {
				luckyNumbers++;
			}
		}

		if (luckyNumbers == 7 || luckyNumbers == 4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		scanner.close();
	}
}
