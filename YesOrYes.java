import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int testCases = scanner.nextInt();
	scanner.nextLine();
	while (testCases-- > 0) {
	    String text = scanner.nextLine().toLowerCase();
	    if (text.equals("yes")) {
		System.out.println("YES");
	    }else{
		System.out.println("NO");
	    }
	}
	scanner.close();
    }	
}
