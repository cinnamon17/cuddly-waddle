import java.util.HashMap;
import java.util.Scanner;

/**
 * AntonAndPolyhedrons
 */
public class AntonAndPolyhedrons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer testCases = Integer.valueOf(scanner.nextLine());
		Integer total = 0;
		HashMap<String, Integer> polyhedrons = new HashMap<>();
		polyhedrons.put("Tetrahedron", 4);
		polyhedrons.put("Cube", 6);
		polyhedrons.put("Octahedron", 8);
		polyhedrons.put("Dodecahedron", 12);
		polyhedrons.put("Icosahedron", 20);

		for (int i = 0; i < testCases; i++) {

			String str = scanner.nextLine();
			if (polyhedrons.get(str) != null) {
				total += polyhedrons.get(str);
			}
		}

		System.out.println(total);
		scanner.close();
	}
}
