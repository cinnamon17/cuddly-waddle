import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] num = new int[4];

	    for (int i = 0; i < num.length; i++) {
		num[i] = scanner.nextInt();
	    }
	    scanner.close();

	    Arrays.sort(num);
	    int a = num[3] - num[2];
	    int b = num[3] - num[1];
	    int c = num[3] - num[0];

	    System.out.println(a + " " + b + " " + c);
	}
}
