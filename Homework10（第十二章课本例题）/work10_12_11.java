
public class work10_12_11 {
	public static void main(String[] args) {
		try {
			new work10_12_11_1(5);
			new work10_12_11_1(-5);
			new work10_12_11_1(0);
		} catch (work10_12_10 ex) {
			System.out.println(ex);
		}

		System.out.println("Number of objects created: " + work10_12_11_1.getNumberOfObjects());
	}
}

class work10_12_11_1 {
	/** The radius of the circle */
	private double radius;

	/** The number of the objects created */
	private static int numberOfObjects = 0;

	/** Construct a circle with radius 1 */
	public work10_12_11_1() throws work10_12_10 {
		this(1.0);
	}

	/** Construct a circle with a specified radius */
	public work10_12_11_1(double newRadius) throws work10_12_10 {
		setRadius(newRadius);
		numberOfObjects++;
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double newRadius) throws work10_12_10 {
		if (newRadius >= 0)
			radius = newRadius;
		else
			throw new work10_12_10(newRadius);
	}

	/** Return numberOfObjects */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	/** Return the area of this circle */
	public double findArea() {
		return radius * radius * 3.14159;
	}
}
