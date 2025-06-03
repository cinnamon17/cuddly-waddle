import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();

	while (testCases--> 0 ) {
	    int numArrayElements = scanner.nextInt();
	    int[] elements = new int[numArrayElements];
	    boolean isOne = false;
	    for (int i = 0; i < elements.length; i++) {
		elements[i] = scanner.nextInt();
	    }
	    Arrays.sort(elements);

	    if (elements.length == 1) {
		System.out.println("YES");
		continue;
	    }

	    for (int i = 0; i < elements.length - 1; i++) {

		if (Math.abs(elements[i] - elements[i+1]) > 1) {
		    System.out.println("NO");
		    isOne = false;
		    break;
		}else{
		    isOne = true;
		}
	    }

	    if (isOne) {
		System.out.println("YES");
	    }
	}

	scanner.close();
    }
}
