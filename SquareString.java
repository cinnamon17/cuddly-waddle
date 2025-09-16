import java.util.Scanner;

/**
 * SquareString
 */
public class SquareString {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int testCases = scanner.nextInt();
	    scanner.nextLine();

	    while (testCases--> 0) {
		String str = scanner.nextLine();

		if (str.length() % 2 == 1) {
		    System.out.println("NO");
		    continue;
		}

		if(str.substring(0, str.length() / 2).equals(str.substring(str.length() / 2))){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	    	
	    }

	    scanner.close();
		
	}
}
