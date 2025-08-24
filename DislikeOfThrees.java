import java.util.Scanner;

public class DislikeOfThrees {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();

	int[] sequence = new int[1001]; // 1-based indexing
	int currentNumber = 1;
	for (int i = 1; i <= 1000;) {
	    if (currentNumber % 3 != 0 && currentNumber % 10 != 3) {
		sequence[i] = currentNumber;
		i++;
	    }
	    currentNumber++;
	}

	while (testCases--> 0) {
	    int k = scanner.nextInt();
	    System.out.println(sequence[k]);
	}

	scanner.close();
    }
}
