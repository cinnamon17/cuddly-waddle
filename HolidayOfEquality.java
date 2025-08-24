import java.util.Scanner;

public class HolidayOfEquality {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int[] people  = new int[n];
	    int spent = 0;
	    int max = 0;

	    for (int i = 0; i < n; i++) {
		people[i] = scanner.nextInt();
		if (people[i] > max) {
		    max = people[i];
		}
	    }

	    for (int i = 0; i < people.length; i++) {
		spent += max - people[i];	
	    }
	
	    System.out.println(spent);
	    scanner.close();
		
	}
}
