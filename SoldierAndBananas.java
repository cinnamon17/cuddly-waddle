import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * SoldierAndBananas
 */
public class SoldierAndBananas {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(row);
		Integer cost = Integer.valueOf(st.nextToken());
		Integer money = Integer.valueOf(st.nextToken());
		Integer requiredBananas = Integer.valueOf(st.nextToken());
		Integer sum = 0;

		for (int i = 0; i <= requiredBananas; i++) {
			sum += cost * i;
		}
		scanner.close();

		if (sum - money <= 0) {
			System.out.println(0);
		} else {
			System.out.println(sum - money);
		}
	}

}
