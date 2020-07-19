// Implement a program to find and display the maximum number out of the given three numbers.


solution:
class Tester {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 1;

		if( num1 >= num2 && num1 >= num3)
          System.out.println(num1+" is the largest Number");

      else if (num2 >= num1 && num2 >= num3)
          System.out.println(num2+" is the largest Number");

      else
          System.out.println(num3+" is the largest Number");


	}
}
