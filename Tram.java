import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Tram
 */
public class Tram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer num = scanner.nextInt();
		StringTokenizer st;
		Integer exits = 0;
		Integer transition = 0;
		Integer enter = 0;
		Integer minCapacity = 0;

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(scanner.nextLine());
			if (st.hasMoreTokens()) {
				exits = Integer.valueOf(st.nextToken());
				enter = Integer.valueOf(st.nextToken());
				transition += enter - exits;
				if (transition > minCapacity) {
					minCapacity = transition;
				}
			}

		}
		scanner.close();

		System.out.println(minCapacity);
	}
}
