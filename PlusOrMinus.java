import java.util.Scanner;

public class PlusOrMinus {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int testCases = scanner.nextInt();
	    
	    while (testCases--> 0) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
	    	

		if (a + b == c) {
			System.out.println("+");
		}else{
			System.out.println("-");
		}
	    }
	    scanner.close();
	}
}
