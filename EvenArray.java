import java.util.Scanner;

/**
 * EvenArray
 */
public class EvenArray {

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases--> 0) {
		    int a = 0;
		    int b = 0;
		    int n = scanner.nextInt();

		    for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();

			if (x % 2 != i % 2) {
			    if (x % 2 == 0) {
				a++;
			    }else{
				b++;
			    }
			}
		    }

		    if (a != b) {
			System.out.println(-1);
		    }else{
			System.out.println(a);
		    }
		}


		scanner.close();
	    }
}
