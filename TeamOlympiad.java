import java.util.Scanner;

/**
 * TeamOlympiad
 */
public class TeamOlympiad {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] children = new int[n];
	int[] programming = new int[n], math = new int[n], pe = new int[n];
	int teams = 0;
	int pCount = 0, mCount = 0, sCount = 0;
	for (int i = 0; i < n; i++) {
	    children[i] = scanner.nextInt();

	    if (children[i] == 1) {
		programming[pCount++] = i + 1;
	    }else if(children[i] == 2){
		math[mCount++] = i + 1;
	    }else if (children[i] == 3){
		pe[sCount++] = i + 1;
	    }
	}

	teams = Math.min(pCount, Math.min(mCount, sCount));
	System.out.println(teams);


	for (int i = 0; i < teams; i++) {
	    System.out.println(programming[i] + " " + math[i] + " " + pe[i]);
		
	}
	scanner.close();

    }	
}
