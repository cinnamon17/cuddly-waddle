import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int red = scanner.nextInt();
	int blue = scanner.nextInt();
	int maxDaysDiferentSocks = Math.min(red, blue);
	int maxDaysEqualSocks = Math.max(red, blue) - maxDaysDiferentSocks;
	scanner.close();

	if (maxDaysEqualSocks % 2 == 0) {
	    System.out.println(maxDaysDiferentSocks + " " + maxDaysEqualSocks / 2);
	}else{
	    System.out.println(maxDaysDiferentSocks + " " + (maxDaysEqualSocks - 1) / 2);
	}
    }
}
