import java.math.BigInteger;
import java.util.Scanner;

/**
 * CalculatingFunction
 */
public class CalculatingFunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger number = new BigInteger(scanner.nextLine());
		BigInteger sum = BigInteger.ONE;

		if (number.mod(BigInteger.valueOf(2)) == BigInteger.valueOf(0)) {
			sum = number.divide(BigInteger.valueOf(2));
		} else {
			BigInteger numberPlusOne = number.add(BigInteger.ONE);
			BigInteger negativeNumberPlusOne = numberPlusOne.negate();
			BigInteger dividedByTwo = negativeNumberPlusOne.divide(BigInteger.valueOf(2));
			sum = dividedByTwo;
		}
		System.out.println(sum);
		scanner.close();
	}
}
