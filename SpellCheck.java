import java.util.Arrays;
import java.util.Scanner;

/**
 * SpellCheck
 */
public class SpellCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		char[] timur = "Timur".toCharArray();
		Arrays.sort(timur);

		String correct = new String(timur);

		while (testCases--> 0) {
		   int n = scanner.nextInt(); 	
		   scanner.nextLine();
		   char[] str = scanner.nextLine().toCharArray();
		   Arrays.sort(str);
		   String sorted = new String(str);

		   System.out.println(correct.equals(sorted) ? "YES": "NO");

		}


		scanner.close();
	}
}
