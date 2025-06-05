import java.util.Arrays;
import java.util.Scanner;

public class MediumNumber {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int testCases = scanner.nextInt();
	    int numbers[] = new int[3];

	    while (testCases--> 0) {
		numbers[0] = scanner.nextInt();
		numbers[1] = scanner.nextInt();
		numbers[2] = scanner.nextInt();

		Arrays.sort(numbers);

		System.out.println(numbers[1]);
	    }


	    scanner.close();
		
	}
}
