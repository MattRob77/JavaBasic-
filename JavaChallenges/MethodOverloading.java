class Shape {

	public float calculateArea(float radius) {
		return 3.14f * radius * radius;
	}

	public float calculateArea(float length, float breadth) {
		return length * breadth;
	}

	public double calculateArea(double height, double base ) {
	    return base * height) 2;
	}
}

class Tester {

	public static void main(String[] args) {

		Shape shape = new Shape();

		float circleArea = shape.calculateArea(1.7f);
		float rectangleArea = shape.calculateArea(2.5f, 3.4f);
		double triangleArea = shape.calculateArea(20.0f, 110.5f);

		System.out.println("Area of circle: " + circleArea);
		System.out.println("Area of rectangle: " + rectangleArea);
		System.out.println("Area of triangle: " + rectangleArea);

	}
}
