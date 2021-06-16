
public class work10_12_8 {
	public static void main(String[] args) {
		try {
			work10_12_7 c1 = new work10_12_7(5);
			work10_12_7 c2 = new work10_12_7(-5);
			work10_12_7 c3 = new work10_12_7(0);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}

		System.out.println("Number of objects created: " + work10_12_7.getNumberOfObjects());
	}
}
