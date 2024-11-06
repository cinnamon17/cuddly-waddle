import java.util.Scanner;

/**
 * BoyOrGirl
 */
public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		Integer duplicated = 0;
		for (int i = 0; i < row.length(); i++) {
			for (int j = i + 1; j < row.length(); j++) {

				if (row.charAt(i) == row.charAt(j)) {
					System.out.println(" index i=" + i + " duplicated i: " + row.charAt(i)
							+ " index j=" + j + " duplicated j: "
							+ row.charAt(j));
					duplicated++;
				}
			}

		}

		System.out.println(duplicated);
		if ((row.length() - duplicated) % 2 == 0) {

			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}
		scanner.close();

	}
}
