import java.math.BigInteger;
import java.util.Scanner;

/**
 * Sliding
 */
public class Sliding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCase = scanner.nextInt();

		for (int i = 0; i < testCase; i++) {
			BigInteger n = BigInteger.valueOf(scanner.nextInt());
			BigInteger m = BigInteger.valueOf(scanner.nextInt());
			BigInteger r = BigInteger.valueOf(scanner.nextInt());
			BigInteger c = BigInteger.valueOf(scanner.nextInt());
			BigInteger manhathan = BigInteger.ZERO;

			manhathan = m.multiply(n.subtract(r))
					.add(n.multiply(m))
					.subtract(r.subtract(BigInteger.ONE).multiply(m).add(c))
					.subtract(n.subtract(r));
			;
			System.out.println(manhathan);
		}
		scanner.close();
	}
}
