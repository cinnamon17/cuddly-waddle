import java.util.Scanner;

/**
 * StairPeakOrNeither
 */
public class StairPeakOrNeither {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases--> 0) {
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int c = scanner.nextInt();

		    if (a < b && b < c) {
			    System.out.println("STAIR");
		    }else if(a < b && b > c){
			    System.out.println("PEAK");
		    }else{
			System.out.println("NONE");
		    }
			
		}

		scanner.close();
	}
}
