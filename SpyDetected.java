import java.util.Scanner;

public class SpyDetected {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int testCases = scanner.nextInt();
	    while (testCases--> 0) {
		int n = scanner.nextInt();
		int[] values = new int[n];

		for (int i = 0; i < values.length; i++) {
		    values[i] = scanner.nextInt();
		}

		int common;
		if (values[0] == values[1]) {
		    common = values[0];
		}else{
		    common = (values[2] == values[0]) ? values[0] : values[1];
		}

		for (int i = 0; i < values.length; i++) {
		    if (values[i] != common) {
			System.out.println(i + 1);
			break;
		    }
		}
	    }

	    scanner.close();
		
	}
}
