import java.util.Scanner;

/**
 * MishkaAndGame
 */
public class MishkaAndGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		int totalM = 0;
		int totalC = 0;

		while (testCases--> 0 ) {
		    int mishka = scanner.nextInt();
		    int chris = scanner.nextInt();

		    if (mishka > chris) {
			totalM++;
		    }else if(chris > mishka){
			totalC++;
		    }
			
		}

		if (totalM > totalC) {
		    System.out.println("Mishka");
		}else if(totalM == totalC){
		    System.out.println("Friendship is magic!^^");
		}else{
		    System.out.println("Chris");
		}

		scanner.close();
	}
}
