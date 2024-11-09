import java.util.Scanner;

public class Elephant {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer position = Integer.valueOf(scanner.nextLine());

		if (position % 5 == 0) {
			System.out.println(position / 5);
		} else if (position % 4 == 0) {
			System.out.println(position / 4);
		} else if (position % 3 == 0) {
			System.out.println(position / 3);
		} else if (position % 2 == 0) {
			System.out.println(position / 2);
		} else if (position % 1 == 0) {
			System.out.println(position / 1);
		}

		scanner.close();
	}

}
