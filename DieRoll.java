import java.util.Scanner;

/**
 * DieRoll
 */
public class DieRoll {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int y = scanner.nextInt();
	int w = scanner.nextInt();
	int max = Math.max(y, w);

	if (max == 1) {
	    System.out.println("1/1");	
	}else if( max == 2){
	    System.out.println("5/6");	
	}else if( max == 3){
	    System.out.println("2/3");	
	}else if( max == 4){
	    System.out.println("1/2");	
	}else if( max == 5){
	    System.out.println("1/3");	
	}else if( max == 6){
	    System.out.println("1/6");	
	}else{
	    System.out.println("0/1");	
	}

	scanner.close();
    }

}
