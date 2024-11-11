import java.util.Scanner;

/**
 * AntonAndDanik
 */
public class AntonAndDanik {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer nGames = Integer.valueOf(scanner.nextLine());
		String games = scanner.nextLine();
		Integer anton = 0;
		Integer danik = 0;

		for (int i = 0; i < nGames; i++) {
			if (games.charAt(i) == 'A') {
				anton++;
			} else if (games.charAt(i) == 'D') {
				danik++;
			}
		}

		if (anton > danik) {
			System.out.println("Anton");
		} else if (anton.equals(danik)) {
			System.out.println("Friendship");
		} else {
			System.out.println("Danik");
		}
		scanner.close();
	}
}
