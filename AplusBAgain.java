import java.util.Scanner;

public class AplusBAgain {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int testCases = scanner.nextInt();
	    scanner.nextLine();

	    while (testCases--> 0) {
		String numbers = scanner.nextLine();
		char digit1 = numbers.charAt(0);
		char digit2 = numbers.charAt(1);
		int a = digit1 - '0';
		int b = digit2 - '0';

		System.out.println(a + b);
	    }


	    scanner.close();
		
	}
}
