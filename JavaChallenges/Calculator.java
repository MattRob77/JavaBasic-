// Build a calculator averaging three numbers and display the average of those numbers.


class Calculator {

	public void findAverage(int num1, int num2, int num3) {
	    double average = ((num1 + num2 + num3)/3.0);
	    System.out.println(average);
	}
}

class Tester {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		calculator.findAverage(12, 8, 15);
		
	}
}
