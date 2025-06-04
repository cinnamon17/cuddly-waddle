import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	scanner.nextLine();
	String codeforces = "codeforces";
	boolean isNotFound = true;

	while (testCases--> 0) {
	    char character = scanner.nextLine().charAt(0);

	    for (int i = 0; i < codeforces.length(); i++) {
		if (character == codeforces.charAt(i)) {
		    System.out.println("YES");
		    isNotFound = false;
		    break;
		}
	    }
	    if (isNotFound) {
		    System.out.println("NO");
	    }
	    isNotFound = true;
	}
	scanner.close();

    }
}
