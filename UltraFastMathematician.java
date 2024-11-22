import java.util.Scanner;

/**
 * UltraFastMathematician
 */
public class UltraFastMathematician {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < input1.length(); i++) {

			if (input1.charAt(i) == input2.charAt(i)) {
				result.append(0);
			} else {
				result.append(1);
			}
		}

		System.out.println(result);
		scanner.close();
	}
}
