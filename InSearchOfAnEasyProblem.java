import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * InSearchOfAnEasyProblem
 */
public class InSearchOfAnEasyProblem {

	public static void main(String[] args) {
		Integer total = 0;
		Scanner scanner = new Scanner(System.in);
		Integer people = Integer.valueOf(scanner.nextLine());
		String row = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(row);

		if (st.hasMoreTokens()) {
			for (int i = 0; i < people; i++) {
				total += Integer.valueOf(st.nextToken());
			}
		}

		if (total >= 1) {
			System.out.println("HARD");

		} else {
			System.out.println("EASY");
		}
		scanner.close();
	}
}
