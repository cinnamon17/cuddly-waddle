import java.util.Scanner;

public class PetyaAndStrings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String first = scanner.nextLine().toLowerCase();
		String second = scanner.nextLine().toLowerCase();

		if (first.compareTo(second) < 0) {
			System.out.println(-1);
		}
		if (first.compareTo(second) > 0) {
			System.out.println(1);
		}

		if (first.compareTo(second) == 0) {
			System.out.println(0);
		}
		scanner.close();
	}
}
