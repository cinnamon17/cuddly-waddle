import java.util.Scanner;

/**
 * GameWithIntegers
 */
public class GameWithIntegers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases--> 0) {
		    int n = scanner.nextInt();

		    if (n % 3 == 0) {
			System.out.println("Second");
		    }else{
			System.out.println("First");
		    }
			
		}

		scanner.close();
	}
}
