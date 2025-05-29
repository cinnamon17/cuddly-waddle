import java.util.Scanner;

public class BuyAShovel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int r = scanner.nextInt();

		for (int i = 1; i < 10; i++) {
			if ((i * k) % 10 == 0 || i * k % 10 == r) {
			    System.out.println(i);
			   break;
			}
		}

		scanner.close();
	}
}
