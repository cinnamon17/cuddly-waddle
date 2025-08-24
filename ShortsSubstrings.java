import java.util.Scanner;

/**
 * ShortsSubstrings
 */
public class ShortsSubstrings {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int testCases = scanner.nextInt();
	    scanner.nextLine();

	    while (testCases--> 0) {
		String b = scanner.nextLine();
		StringBuffer str = new StringBuffer();

		for (int i = 0; i < b.length() - 1; i+=2) {
		    str.append(b.charAt(i));
		}
		str.append(b.charAt(b.length() - 1));
		System.out.println(str);
	    }


	    scanner.close();
		
	}
}
