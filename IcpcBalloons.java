import java.util.Scanner;

/**
 * IcpcBalloons
 */
public class IcpcBalloons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases--> 0) {
		    int[] seen = new int[26];
		    int n = scanner.nextInt();
		    scanner.nextLine();
		    String str = scanner.nextLine();
		    int counter = 0;

		    for (int i = 0; i < n; i++) {

			if (seen[str.charAt(i)- 'A'] == 0) {
			    seen[str.charAt(i) - 'A'] = 1;
			    counter += 2;
			}else{
			    counter++;
			}
		    	
		    }
		    System.out.println(counter);
			
		}

		scanner.close();
	}
}
