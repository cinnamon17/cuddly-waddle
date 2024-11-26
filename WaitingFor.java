import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * WaitingFor
 */
public class WaitingFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer events = Integer.valueOf(scanner.nextLine());
		Integer passengers = 0;
		Integer busSeats = 0;

		for (int i = 0; i < events; i++) {

			StringTokenizer st = new StringTokenizer(scanner.nextLine());
			String type = st.nextToken();
			Integer value = Integer.valueOf(st.nextToken());

			if (type.equals("P")) {
				passengers += value;
			} else if (type.equals("B")) {
				busSeats += value;
				if (busSeats - passengers > 0) {
					busSeats = 0;
					passengers = 0;
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}

		scanner.close();
	}
}
