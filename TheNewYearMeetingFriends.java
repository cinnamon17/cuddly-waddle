import java.util.Arrays;
import java.util.Scanner;

/**
 * TheNewYearMeetingFriends
 */
public class TheNewYearMeetingFriends {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] pos = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		Arrays.sort(pos);

		System.out.println(pos[2] - pos[0]);

		scanner.close();
	}
}
