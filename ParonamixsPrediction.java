import java.util.Scanner;

/**
 * ParonamixsPrediction
 */
public class ParonamixsPrediction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int[] primeNumbers = new int[m];

		for (int i = 0; i < primeNumbers.length; i++) {
		    primeNumbers[i] = i + 1;
		}

		primeNumbers[0] = 0;
		for (int i = 1; i < primeNumbers.length; i++) {
		    if((primeNumbers[i] * primeNumbers[i]) <= m ){
			for (int j = i + 1; j < primeNumbers.length; j++) {
			    if(primeNumbers[i] !=0 && primeNumbers[j] !=0 && primeNumbers[j] % primeNumbers[i] == 0){
				primeNumbers[j]	= 0;
			    }
			}
		    }
		}

		int nextPrime = 0;

		for (int i = primeNumbers[n - 1]; i < primeNumbers.length; i++) {

		    if (primeNumbers[i] != 0) {
			nextPrime = primeNumbers[i];
			break;
		    }
		}

		System.out.println(nextPrime == m? "YES": "NO");

		scanner.close();
	}
}
