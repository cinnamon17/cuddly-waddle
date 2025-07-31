import java.util.Scanner;

/**
 * CreatingWords
 */
public class CreatingWords {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	scanner.nextLine();

	while (testCases--> 0) {
	    String[] line = scanner.nextLine().split(" ");
	    System.out.println("" + line[1].charAt(0) + line[0].substring(1) + " " + line[0].charAt(0) + line[1].substring(1));
	}

	scanner.close();

    }	
}
