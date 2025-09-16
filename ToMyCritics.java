import java.util.Scanner;

/**
 * ToMyCritics
 */
public class ToMyCritics {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases-- > 0) {
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int c = scanner.nextInt();

		    if (a + b >= 10 || a + c >= 10 || b + c >= 10) {
			System.out.println("YES");
		    	
		    }else{
			System.out.println("NO");
		    }
			
		}



		scanner.close();
	}
}
