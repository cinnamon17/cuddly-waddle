import java.util.Scanner;

public class WordCapitalization {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String row = scanner.nextLine();

		String upperCaseFirstLetter = row.substring(0, 1);
		upperCaseFirstLetter = upperCaseFirstLetter.toUpperCase();

		System.out.println(upperCaseFirstLetter + row.substring(1, row.length()));
		scanner.close();
	}
}
