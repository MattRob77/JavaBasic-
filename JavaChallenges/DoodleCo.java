public class Customer {
	public static void main(String[] args) {
		String customerType = "Regular";
		int quantity = 1;
		int unitPrice = 75;
		int totalCost = 0;
		int discount = 10;
		totalCost = unitPrice * quantity;
		if (customerType == "Regular") {
			totalCost = totalCost - (totalCost * discount / 100);
			System.out.println("You are a regular customer and eligible for 10% discount");
		}
		System.out.println("Total cost: " + totalCost);
	}
}
