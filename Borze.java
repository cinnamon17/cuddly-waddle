import java.util.Scanner;

public class Borze {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String borze = scanner.nextLine();
	    StringBuilder parsedBorze = new StringBuilder();
	    scanner.close();

	    for (int i = 0; i < borze.length(); i++) {
		if (borze.charAt(i) == '-' && i < borze.length()) {
		    if (borze.charAt(i + 1) == '-') {
			parsedBorze.append('2');
			i++;
		    }else{
			parsedBorze.append('1');
			i++;
		    }
		}else if(borze.charAt(i) == '.'){
		    parsedBorze.append('0');
		}
	    }

	    System.out.println(parsedBorze);
	}
}
