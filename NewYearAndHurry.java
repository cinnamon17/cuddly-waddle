import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int remainingTime = 240 - k;
        int sum = 0;
        int total  = 0;


        for (int i = 1; i <= n; i++) {
            if (total + 5 * i <= remainingTime ){
                sum++;
            }
            total += 5 * i;

        }

        System.out.println(sum);
        scanner.close();

    }
}
