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
