import java.util.Scanner;

/**
 * LoveStory
 */
public class LoveStory {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int testCases = scanner.nextInt();
	    scanner.nextLine();

	    String codeforces = "codeforces";
	    while (testCases--> 0 ) {
		String str = scanner.nextLine();
		int index = 0;

		for (int i = 0; i < 10; i++) {
		    if(codeforces.charAt(i) != str.charAt(i)){
			index++;
		    }
		}

		System.out.println(index);
	    	
	    }

	    scanner.close();
	}
}
