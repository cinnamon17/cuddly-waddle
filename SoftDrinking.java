import java.util.Scanner;
public class SoftDrinking{
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] values = scanner.nextLine().split(" ");
	int n, k, l, c, d, p, nl, np;
	n = Integer.parseInt(values[0]);
	k = Integer.parseInt(values[1]);
	l = Integer.parseInt(values[2]);
	c = Integer.parseInt(values[3]);
	d = Integer.parseInt(values[4]);
	p = Integer.parseInt(values[5]);
	nl = Integer.parseInt(values[6]);
	np = Integer.parseInt(values[7]);

	int soda = (k * l) / (n * nl);
	int limes = (c * d) / n;
	int salt = p / (n * np);
	System.out.println(Math.min(soda, Math.min(limes, salt)));
	scanner.close();
    }
}
