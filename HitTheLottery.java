import java.util.Scanner;

/**
 * HitTheLottery
 */
public class HitTheLottery {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer total = scanner.nextInt();
		Integer counter = 0;
		Integer temp = 0;
		Integer[] bills = { 100, 20, 10, 5, 1 };

		for (int i = 0; i < bills.length; i++) {

			while (true) {

				if (temp + bills[i] <= total) {
					temp += bills[i];
					counter++;
				} else {
					break;
				}
			}
		}

		System.out.println(counter);
		scanner.close();
	}
}
