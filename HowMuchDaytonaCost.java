import java.util.Scanner;

/**
 * HowMuchDaytonaCost
 */
public class HowMuchDaytonaCost {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();

	while (testCases--> 0) {
	    boolean exists = false;
	    int n = scanner.nextInt();
	    int k = scanner.nextInt();

	    for (int i = 0; i < n; i++) {
		int number = scanner.nextInt();
		if (number == k) {
		   exists = true; 
		}
	    }

	    System.out.println(exists ? "YES": "NO");
		
	}


	scanner.close();
    }
	
}
