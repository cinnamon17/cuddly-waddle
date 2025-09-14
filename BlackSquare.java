import java.util.Scanner;

/**
 * BlackSquare
 */
public class BlackSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		String line = scanner.nextLine();
		int sum = 0;


		for (int i = 0; i < line.length(); i++) {
		    int index = line.charAt(i) - '0';
		    sum += Integer.parseInt(arr[index - 1]);
		}

		System.out.println(sum);
		scanner.close();
	}
}
