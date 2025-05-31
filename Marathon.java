import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	scanner.nextLine();
	while (testCases-- > 0) {
	    String[] participants = scanner.nextLine().split(" ");
	    int tim = Integer.parseInt(participants[0]);
	    int front = 0;
	    for (int i = 1; i < participants.length; i++) {
		if (tim < Integer.parseInt(participants[i])) {
		    front++;
		}	
	    }
	    System.out.println(front);
	}
	scanner.close();
    }
}
