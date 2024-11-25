import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Games
 */
public class Games {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer games = Integer.valueOf(scanner.nextLine());
		Integer[] homeColors = new Integer[games];
		Integer[] guestColors = new Integer[games];
		Integer counter = 0;

		for (int i = 0; i < games; i++) {
			StringTokenizer st = new StringTokenizer(scanner.nextLine());
			if (st.hasMoreTokens()) {
				Integer home = Integer.valueOf(st.nextToken());
				Integer guest = Integer.valueOf(st.nextToken());
				homeColors[i] = home;
				guestColors[i] = guest;
			}
		}

		for (int i = 0; i < guestColors.length; i++) {
			for (int j = 0; j < homeColors.length; j++) {
				if (guestColors[i] == homeColors[j]) {
					counter++;
				}
			}
		}
		System.out.println(counter);
		scanner.close();
	}
}
