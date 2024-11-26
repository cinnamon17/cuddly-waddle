import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * InterceptedInputs
 */
public class InterceptedInputs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());
		Map<Integer, Integer> numbers = new HashMap<>();
		for (int i = 0; i < testCases; i++) {
			Integer inputs = Integer.valueOf(scanner.nextLine());
			StringTokenizer st = new StringTokenizer(scanner.nextLine());

			for (int j = 0; j < inputs; j++) {
				numbers.put(j, Integer.valueOf(st.nextToken()));
			}
			for (int j = 0; j < inputs; j++) {
				Integer n = numbers.get(j);
				Integer m = numbers.get((inputs - 2) / n);

				if (n * m == inputs - 2) {
					System.out.println(n + " " + m);
					break;
				}
			}
		}

		scanner.close();

	}

}
