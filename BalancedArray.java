import java.util.Scanner;

/**
 * BalancedArray
 */
public class BalancedArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();

		while (testCases--> 0) {
		    int n = scanner.nextInt();

		    if (n % 4 != 0) {
			System.out.println("NO");
			continue;
		    }

		    int[] arr = new int[n];
		    arr[0] = 2;
		    for (int i = 1; i < n/2; i++) {
			arr[i] = arr[i-1] + 2; 
		    }

		    arr[n/2] = 1;
		    for (int i = n/2 + 1; i < n; i++) {
			if(i == n-1){
			    arr[i] = arr[i-1] + 2 + n/2; 
			}else{
			    arr[i] = arr[i-1] + 2; 
			}
		    }

		    StringBuilder str = new StringBuilder();

		    for (int i = 0; i < arr.length; i++) {
			str.append(arr[i]);
			if (i < arr.length - 1) {
			    str.append(" ");
			}
		    	
		    }

		    System.out.println("YES");
		    System.out.println(str);
			
		}


		scanner.close();
	}
}
