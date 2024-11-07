import java.util.Scanner;
import java.util.StringTokenizer;

public class BearAndBigBrother {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(row);
		Integer counter = 0;

		if (st.hasMoreTokens()) {

			Integer limark = Integer.valueOf(st.nextToken());
			Integer bob = Integer.valueOf(st.nextToken());

			while (limark <= bob) {

				limark = limark * 3;
				bob = bob * 2;
				counter++;
			}
		}
		System.out.println(counter);

		scanner.close();

	}
}
