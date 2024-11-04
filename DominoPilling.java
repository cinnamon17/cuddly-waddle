import java.util.Scanner;
import java.util.StringTokenizer;

public class DominoPilling {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(scanner.nextLine());

		if (st.hasMoreTokens()) {

			Integer m = Integer.valueOf(st.nextToken());
			Integer n = Integer.valueOf(st.nextToken());

			Integer total = m * n;

			if (total % 2 == 0) {
				System.out.println(total / 2);
			} else {

				System.out.println((total - 1) / 2);
			}

		}
		scanner.close();
	}
}
