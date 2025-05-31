import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int numOfcards = scanner.nextInt();
	int[] cards = new int[numOfcards];
	int sereja = 0;
	int dima = 0;
	int pointerA = 0;
	int pointerB = cards.length - 1;
	boolean isSerejaTurn = true;
	for (int i = 0; i < numOfcards; i++) {
	    cards[i] = scanner.nextInt();	
	}
	scanner.close();
	for (int i = 0; i < cards.length; i++) {

	    if (isSerejaTurn) {
		if (cards[pointerA] > cards[pointerB]) {
		sereja += cards[pointerA];
		    pointerA++;
		}else{
		sereja += cards[pointerB];
		    pointerB--;
		}
		isSerejaTurn = false;
	    }else{
		if (cards[pointerA] > cards[pointerB]) {
		dima += cards[pointerA];
		    pointerA++;
		}else{
		dima += cards[pointerB];
		    pointerB--;
		}
		isSerejaTurn = true;
	    }
	}
	System.out.println(sereja + " " + dima);
    }
}
