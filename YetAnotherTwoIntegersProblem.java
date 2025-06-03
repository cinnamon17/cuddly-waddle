import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases-- > 0) {
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int diff = Math.abs(a - b);
		    System.out.println((diff + 9) / 10);
		}
		scanner.close();
	}
}
