import java.util.Scanner;

/**
 * PrependAndAppend
 */
public class PrependAndAppend {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();

	while (testCases--> 0) {
	    int length = scanner.nextInt();
	    scanner.nextLine();
	    StringBuilder str = new StringBuilder(scanner.nextLine());
	    int counter = 0;

	    for (int i = 0; i < length/2; i++) {

		if (str.charAt(i) == '0' && str.charAt(length - 1 - i) == '1' || str.charAt(i) == '1' && str.charAt(length - 1 - i) == '0') {
		    counter++;
		}else{
		    break;
		}
	    }
	    System.out.println(str.length() + (counter * - 2));
	}

	scanner.close();
    }
}
