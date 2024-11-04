import java.util.Scanner;
import java.util.StringTokenizer;

public class HelpfulMaths {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		Integer c1, c2, c3;
		c1 = c2 = c3 = 0;

		StringTokenizer st = new StringTokenizer(row, "+");
		StringBuilder finalString = new StringBuilder();

		while (st.hasMoreTokens()) {

			String c = st.nextToken();
			if (c.equals("1")) {
				c1++;
			} else if (c.equals("2")) {
				c2++;
			} else if (c.equals("3")) {
				c3++;
			}
		}

		finalString.append("+1".repeat(c1) + "+2".repeat(c2) + "+3".repeat(c3));
		finalString.deleteCharAt(0);
		System.out.println(finalString);

		scanner.close();
	}

}
