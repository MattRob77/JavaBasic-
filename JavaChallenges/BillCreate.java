//Creating Bill using uses-a association

public boolean generateBill(Order order) {
		System.out.println("Bill details \n***********");
		System.out.println("Bill Id : " + this.getBillId());
		System.out.println("Items ordered : ");
		for (Food food : order.getOrderedFoods()) {
			System.out.println(food.getFoodName());
		}
		double payableAmount = order.calculateTotalPrice(this.getPaymentMode());
		System.out.println("Payable Amount : $" + (int) (payableAmount * 100)
				/ 100.0);
		return true;
}



//main method below -Tester

public static void main(String[] args) {
	Food food1 = new Food();
		food1.setFoodName("Pasta");
		food1.setFoodType("Non-Dairy");
		food1.setCuisine("Italian");
		food1.setUnitPrice(11.8);
		food1.setQuantityAvailable(12);

		Food food2 = new Food();
		food2.setFoodName("Hamburger");
		food2.setFoodType("Meat");
		food2.setCuisine("American");
		food2.setUnitPrice(15);
		food2.setQuantityAvailable(40);

		Food orderedFoods[]= new Food[] {food1,food2};
		Order order = new Order(101, orderedFoods);
		Bill bill = new Bill("PayPal");
		bill.generateBill(order);
}
