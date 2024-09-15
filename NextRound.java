import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * NextRound
 */
public class NextRound {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String playersAndWinner = scanner.nextLine();
		StringTokenizer players = new StringTokenizer(playersAndWinner);

		Integer numPlayers = Integer.valueOf(players.nextToken());
		Integer winnerPos = Integer.valueOf(players.nextToken());
		String row = scanner.nextLine();
		StringTokenizer rowCopy = new StringTokenizer(row);
		Integer[] values = new Integer[numPlayers];

		for (int i = 0; i < row.length(); i++) {

			if (rowCopy.hasMoreTokens()) {
				values[i] = Integer.valueOf(rowCopy.nextToken());
			}
		}

		Integer winnerScore = values[winnerPos - 1];
		StringTokenizer scores = new StringTokenizer(row);
		int advancers = 0;

		for (int i = 0; i < numPlayers; i++) {
			if (scores.hasMoreTokens()) {
				Integer token = Integer.valueOf(scores.nextToken());
				if (token >= winnerScore && token > 0) {
					advancers++;
				}
			}

		}
		System.out.println(advancers);
		scanner.close();
	}
}
