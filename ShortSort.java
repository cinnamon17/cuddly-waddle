import java.util.Scanner;

/**
 * ShortSort
 */
public class ShortSort {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	scanner.nextLine();

	while (testCases--> 0) {
	    String row = scanner.nextLine();
	    if (row.equals("bca") || row.equals("cab")) {
		System.out.println("NO");
	    }else{
		System.out.println("YES");
	    }
	}
	scanner.close();
    }
	
}
