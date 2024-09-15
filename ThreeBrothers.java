import java.util.Scanner;
import java.util.StringTokenizer;

public final class ThreeBrothers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(input);
		int sum = 0;

		while (st.hasMoreTokens()) {
			sum += Integer.valueOf(st.nextToken());
		}

		scanner.close();

		System.out.println(6 - sum);

	}

}
