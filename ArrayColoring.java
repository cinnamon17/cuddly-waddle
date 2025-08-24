import java.util.Scanner;

/**
 * ArrayColoring
 */
public class ArrayColoring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases--> 0) {
		    int length = scanner.nextInt();
		    int result = 0;
		    for (int i = 0; i < length; i++) {
			result += scanner.nextInt();	
		    }

		    if (result % 2 == 0) {
			System.out.println("YES");
		    }else{
			System.out.println("NO");
		    }
			
		}

		scanner.close();
	}
}
