public class Restaurant {

	public String restaurantName;
	public long restaurantContact;
	public String restaurantAddress;
	public float rating;

	public void displayRestaurantDetails() {
		System.out.println("Restaurant Details \n************");
		System.out.println("Restaurant Name : " + restaurantName);
		System.out.println("Restaurant Rating : " + rating);
		System.out.println("Restaurant Contact : " + restaurantContact);
		System.out.println("Restaurant Address : " + restaurantAddress);
		System.out.println();

	}
}

class Tester {
	public static void main(String[] args) {

		Restaurant restaurant = new Restaurant();

		restaurant.restaurantName = "Peace Food";
		restaurant.rating = 4;
		restaurant.restaurantContact = 998867676;
		restaurant.restaurantAddress = "BH1019, Vine Street, Loinfield";


		restaurant.displayRestaurantDetails();
	}
}
