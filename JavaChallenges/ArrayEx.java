class Restaurant {
	private String restaurantName;
	private long restaurantContact1;
	private long restaurantContact2;
	private long restaurantContact3;
	private String restaurantAddress;
	private float rating;
	public Restaurant(String name, long contact1, long contact2, long contact3,
			String restaurantAddress, float rating) {
		this.restaurantName = name;
		// Created 3 instant variables for 3 different contact numbers of restaurant
		this.restaurantContact1 = contact1;
		this.restaurantContact2 = contact2;
		this.restaurantContact3 = contact3;
		this.restaurantAddress = restaurantAddress;
		this.rating = rating;
	}
	// Corresponding Getter and Setter methods
	public void viewRestaurantDetails() {
		System.out.println("Displaying restaurant details \n***************");
		System.out.println("Restaurant Name : " + this.restaurantName);
		System.out.println("Restaurant Rating : " + this.rating);
		// Printing the different contact numbers of restaurant
		System.out.println("Restaurant Contact1 : " + this.restaurantContact1);
		System.out.println("Restaurant Contact2 : " + this.restaurantContact2);
		System.out.println("Restaurant Contact3 : " + this.restaurantContact3);
		System.out.println("Restaurant Address : " + this.restaurantAddress);
		System.out.println();
	}
}


//Accessing the daya in the array
long[] restaurantContacts = new long[3];
restaurantContacts [0] = 9992346725L; // Elements can be updated and accessed with the help of index
restaurantContacts [1] = 9992346726L;
restaurantContacts [2] = 9992346727L;
System.out.println(restaurantContacts [1]) ;// Accessing and displaying the element at the 1st index


//Accessing the data from index of array using a loop
public class Tester {
	public static void main(String[] args) {
		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
		for (int index = 0; index < restaurantContacts.length; index++) {
			// Accessing element at position index
			System.out.println(restaurantContacts[index]);
		}
	}
}


//Accessing elements in an array using foreach-loop
for (dataType variable: array) {
	//body of the loop
}
The below code displays the elements of restaurantContacts array using the for-each loop.

public class Tester {
	public static void main(String[] args) {
		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
		for (long contactNumber : restaurantContacts) {
			System.out.println(contactNumber);
		}
	}
}
