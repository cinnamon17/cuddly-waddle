import java.util.Scanner;

/**
 * InsomniaCure
 */
public class InsomniaCure {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer k = scanner.nextInt();
		Integer l = scanner.nextInt();
		Integer m = scanner.nextInt();
		Integer n = scanner.nextInt();
		Integer d = scanner.nextInt();
		Integer counter = 0;

		for (int i = 1; i <= d; i++) {
			if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
				counter++;
			}
		}
		System.out.println(counter);
		scanner.close();
	}
}
