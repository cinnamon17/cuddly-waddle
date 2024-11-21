import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Drinks
 */
public class Drinks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer drinks = scanner.nextInt();
		BigDecimal sum = BigDecimal.ZERO;

		for (int i = 0; i < drinks; i++) {
			sum = sum.add(BigDecimal.valueOf(scanner.nextInt()));
		}

		System.out.println(sum.divide(BigDecimal.valueOf(drinks), 12, RoundingMode.CEILING));
		scanner.close();
	}
}
