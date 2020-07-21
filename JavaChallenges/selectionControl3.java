// calculate the product of three positive integer values.
// if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.


solution:
class Tester {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 5;
		int num3 = 3;

		if (num1 < num2 &&  num1 < num3) {
		    System.out.println(num2 * num3);
		}
		else {
		    System.out.println(num1 + num2 + num3);
		}
	}
}



class Tester {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 8;
		int num3 = 2;

		if (num1 == 7 && num2 == 7) {
		    System.out.println(num3);
		}
		else if (num2 == 7) {
		    System.out.println(num3);
		}
		else if (num3 == 7) {
		    System.out.println(-1);
		}
		else {
		    System.out.println(num2 * num3);
		}
	}
}
