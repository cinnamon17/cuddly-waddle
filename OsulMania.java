import java.util.Scanner;
import java.util.Stack;

/**
 * OsulMania
 */
public class OsulMania {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> beatNotes = new Stack<String>();
		Integer testCases = Integer.valueOf(scanner.nextLine());

		for (int l = 0; l < testCases; l++) {
			Integer beatRows = Integer.valueOf(scanner.nextLine());
			StringBuilder beatLines = new StringBuilder();

			for (int j = 0; j < beatRows; j++) {
				beatNotes.push(scanner.nextLine());
			}

			for (int k = 0; k < beatRows; k++) {

				String lastElement = beatNotes.pop();
				for (int i = 0; i < lastElement.length(); i++) {
					if (String.valueOf(lastElement.charAt(i)).equals("#")) {
						beatLines.append(i + 1);
						beatLines.append(" ");
					}
				}

			}

			System.out.println(beatLines.toString());
		}

		scanner.close();

	}

}
