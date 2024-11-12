import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * VanayAndFence
 */
public class VanayAndFence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(row);
		Integer friends, fenceHeight, friend, counter = 0;

		if (st.hasMoreTokens()) {
			friends = Integer.valueOf(st.nextToken());
			fenceHeight = Integer.valueOf(st.nextToken());
			st = new StringTokenizer(scanner.nextLine());

			for (int i = 0; i < friends; i++) {

				if (st.hasMoreTokens()) {
					friend = Integer.valueOf(st.nextToken());
					if (friend > fenceHeight) {
						counter = counter + 2;
					} else {
						counter++;
					}
				}
			}
		}
		scanner.close();
		System.out.println(counter);
	}
}
