import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * GeorgeAndAccomodation
 */
public class GeorgeAndAccomodation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer rooms = Integer.valueOf(scanner.nextLine());
		Integer counter = 0;

		for (int i = 0; i < rooms; i++) {
			String row = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(row);

			if (st.hasMoreTokens()) {

				Integer people = Integer.valueOf(st.nextToken());
				Integer available = Integer.valueOf(st.nextToken());

				if (available - people >= 2) {
					counter++;
				}
			}
		}

		System.out.println(counter);
		scanner.close();
	}
}
