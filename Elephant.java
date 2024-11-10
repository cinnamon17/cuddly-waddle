import java.util.Scanner;

public class Elephant {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		System.out.println((int) Math.ceil((float) x / 5));

		scanner.close();
	}

}
