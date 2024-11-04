import java.util.Scanner;
import java.util.StringTokenizer;

public class BeautifullMatrix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer xPos = 0;
		Integer yPos = 0;

		for (int j = 0; j < 5; j++) {

			String row = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(row);
			for (int i = 0; i < 5; i++) {

				if (Integer.valueOf((st.nextToken())) > 0) {
					xPos = i + 1;
					yPos = j + 1;
					break;
				}
			}
		}

		Integer xMoves = 0;
		Integer yMoves = 0;

		if (xPos > 3) {
			for (int i = xPos; i > 3; i--) {
				xMoves++;
			}
		} else if (xPos < 3) {
			for (int i = xPos; i < 3; i++) {
				xMoves++;
			}
		}

		if (yPos > 3) {
			for (int i = yPos; i > 3; i--) {
				yMoves++;
			}
		} else if (yPos < 3) {
			for (int i = yPos; i < 3; i++) {
				yMoves++;
			}
		}

		System.out.println(xMoves + yMoves);
		scanner.close();
	}
}
