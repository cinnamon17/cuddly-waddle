import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hints = scanner.nextLine() + scanner.nextLine();
        String completeString = scanner.nextLine();
        char[] sortedHints = hints.toCharArray();
        char[] sortedComplete = completeString.toCharArray();
        Arrays.sort(sortedHints);
        Arrays.sort(sortedComplete);
        hints = new String(sortedHints);
        completeString = new String(sortedComplete);

        if (hints.equals(completeString)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        scanner.close();
    }
}
