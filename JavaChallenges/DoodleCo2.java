public class Customer {
	public static void main(String[] args) {
		String customerType = "Guest";
		int quantity = 2;
		int unitPrice = 75;
		int totalCost = 0;
		int discount = 10;
		int pickUpCharge = 5;
		totalCost = (unitPrice * quantity);
		if (customerType == "Regular") {
			totalCost = totalCost - (totalCost * discount / 100);
			System.out.println("You are a regular customer and have got 10% discount");
			System.out.println("The total cost to be paid is " + totalCost);
			if (totalCost >= 75) {
				System.out.println("You have got a gift voucher!!!!");
			}
		} else if (customerType == "Guest") {
			totalCost = totalCost + pickUpCharge;
			System.out.println("You need to pay an additional pick up charge of $5");
			System.out.println("The total cost to be paid is " + totalCost);
		} else {
			System.out.println("Choice Invalid");
		}
	}
}
