import java.util.Scanner;

public class VanyaAndCubes {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int h = 0;
	int cnt = 0;

	while (cnt <= n)
	{
	    h++;
	    cnt += (h*(h+1))/2;
	}

	System.out.println(h - 1);

	scanner.close();
    }
}
