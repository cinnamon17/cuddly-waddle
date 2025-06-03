import java.util.Scanner;

public class Lucky {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int testCases = scanner.nextInt();
	    scanner.nextLine();

	    while (testCases-- > 0) {
		String ticketNumber = scanner.nextLine();	
		int firstThreedigits = 0;
		int lastThreedigits = 0;

		for (int i = 0; i < ticketNumber.length(); i++) {
		    if (i < 3) {
			firstThreedigits += Integer.parseInt(String.valueOf(ticketNumber.charAt(i)));
		    }else{
			lastThreedigits += Integer.parseInt(String.valueOf(ticketNumber.charAt(i)));
		    }
		}

		if (firstThreedigits == lastThreedigits) {
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	    }
		
	    scanner.close();
	}
}
