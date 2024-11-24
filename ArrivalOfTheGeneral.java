import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * ArrivalOfTheGeneral
 */
public class ArrivalOfTheGeneral {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer lenght = Integer.valueOf(scanner.nextLine());
		String row = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(row);
		Integer[] soldiers = new Integer[lenght];
		Integer moves = 0;
		Integer first = 0;
		Integer firstIndex = 0;
		Integer last = 0;
		Integer lastIndex = 0;

		for (int i = 0; i < lenght; i++) {
			if (st.hasMoreTokens()) {
				soldiers[i] = Integer.valueOf(st.nextToken());
			}
		}

		first = soldiers[0];
		last = soldiers[0];

		for (int i = 0; i < soldiers.length - 1; i++) {

			if (first < soldiers[i + 1]) {
				first = soldiers[i + 1];
				firstIndex = i + 1;
			}

			if (last >= soldiers[i + 1]) {
				last = soldiers[i + 1];
				lastIndex = i + 1;
			}
		}

		moves = firstIndex + (lenght - 1 - lastIndex) - (firstIndex > lastIndex ? 1 : 0);
		System.out.println(moves);
		scanner.close();
	}
}
