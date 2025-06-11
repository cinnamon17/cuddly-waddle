import java.util.Scanner;

/**
 * DesignTutorialFromMath
 */
public class DesignTutorialFromMath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		if (n % 2 == 0) {
		    System.out.println("8 " + (n-8));
		}else{
		    System.out.println("9 " + (n-9));
		}


		scanner.close();
	}
}
