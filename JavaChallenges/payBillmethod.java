public void payBill(double totalPrice, double discountPercentage) {
	System.out.println("Calculating final amount to be paid......");
	double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
	System.out.println("Hi " + customerName
			+ ", your final bill amount after discount is: "
			+ (int) (priceAfterDiscount * 100) / 100.0);
}




public double payBill(double totalPrice) {
	double discountPercentage = 10;
	System.out.println("Calculating final amount to be paid.....");
	double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
	return priceAfterDiscount;
}
