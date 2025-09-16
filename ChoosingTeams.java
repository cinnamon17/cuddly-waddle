import java.util.Scanner;

/**
 * ChoosingTeams
 */
public class ChoosingTeams {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int k = scanner.nextInt();
	int[] students = new int[n];
	int total = 0;
	int people = 0;

	for (int i = 0; i < n; i++) {
	    students[i] = scanner.nextInt();
	}

	scanner.close();

	for (int i = 0; i < students.length; i++) {

	    if ( k + students[i] <= 5 ) {
		people++;
	    }

	    if (people == 3) {
		total++;
		people = 0;
	    }

	}

	System.out.println(total);

    }
}
