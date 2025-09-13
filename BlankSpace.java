import java.util.Scanner;

/**
 * BlankSpace
 */
public class BlankSpace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases--> 0 ) {
		    int length = scanner.nextInt();
		    int[] arr = new int[length];
		    int total = 0;
		    int pivot = 0;

		    for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();	

			if (arr[i] == 0) {
			    pivot++;
			}else{
			    total = Math.max(total, pivot);
			    pivot = 0;
			}
		    }

		    System.out.println(Math.max(total, pivot));
		}

		scanner.close();
	}
}
