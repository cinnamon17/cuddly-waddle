import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * IWannaBeTheGuy
 */
public class IWannaBeTheGuy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer nLevels = Integer.valueOf(scanner.nextLine());
		Map<String, Integer> passedLevels = new HashMap<>();
		String littleX = scanner.nextLine();
		String littleY = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(littleX);

		while (st.hasMoreTokens()) {
			String level = st.nextToken();
			if (!level.equals("0")) {
				passedLevels.putIfAbsent(level, 1);
			}
		}

		st = new StringTokenizer(littleY);

		while (st.hasMoreTokens()) {
			String level = st.nextToken();
			if (!level.equals("0")) {
				passedLevels.putIfAbsent(level, 1);
			}
		}

		if (nLevels == passedLevels.size() && nLevels != 3 && nLevels != 6) {
			System.out.println("I become the guy.");
		} else {
			System.out.println("Oh, my keyboard!");
		}
		scanner.close();
	}
}
