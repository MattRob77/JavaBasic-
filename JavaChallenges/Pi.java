// Build a program to finding the area of a circle and display the calculated area.
//
// Area = pi*radius*radius
//
// The value of pi is 3.14.


solution:
class Tester {
	public static void main(String[] args) {
	    int r = 4; //Int radius
	    double area;
	    area = (r*r)*Math.PI;//Math method to compute the circle
	    System.out.println("Area of the circle is :"+area);//prints out the area 
	}
}
