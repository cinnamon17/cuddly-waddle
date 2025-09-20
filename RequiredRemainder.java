import java.util.Scanner;

/**
 * RequiredRemainder
 */
public class RequiredRemainder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases--> 0) {
		    int x = scanner.nextInt();
		    int y = scanner.nextInt();
		    int n = scanner.nextInt();

		    if (n - n % x + y <= n) {
			System.out.println(n - n % x + y);
		    } else {
			System.out.println(n - n % x - (x - y));
		    }
		}

		scanner.close();
	}
}
