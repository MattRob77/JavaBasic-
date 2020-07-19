// Implement a program to calculate the factorial of a given number.


solution:
class Tester {
	public static void main(String[] args) {
		 int i,num = 5; //i is at 1 num equal to 5
		 int count = 1; //count equals 5
		 for(i = 1;i <=num;i++) { //
		     count=count *i;
		 }
		 System.out.println("Factorial of "+count);
	}
}
