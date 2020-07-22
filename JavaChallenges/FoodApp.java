public class Restaurant {

	public String restaurantName;
	public long restaurantContact;
	public String restaurantAddress;
	public float rating;

	public Restaurant() {
		System.out.println("Parameterless constructor called");
	}

	public Restaurant(String restaurantName, long restaurantContact, String restaurantAddress, float rating ) {


		this.restaurantName = restaurantName;
		this.rating = rating;
		this.restaurantContact = restaurantContact;
		this.restaurantAddress = restaurantAddress;

	}

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
