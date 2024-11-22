import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * IsYourHorseShoeOnTheOtherHoof
 */
public class IsYourHorseShoeOnTheOtherHoof {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		Integer lenght = 0;
		StringTokenizer st = new StringTokenizer(row);
		HashMap<String, Integer> shoes = new HashMap<>();

		while (st.hasMoreTokens()) {
			shoes.putIfAbsent(st.nextToken(), 1);
			lenght++;
		}

		System.out.println(lenght - shoes.size());
		scanner.close();
	}
}
