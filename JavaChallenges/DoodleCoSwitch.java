public class Customer {
	public static void main(String[] args) {
		String orderedService = "Clean";
		switch (orderedService) {
		case "Fresh Cut":
			System.out.println("You have ordered a Fresh Cut. Unit price: $40");
			break;
		case "Playtime":
			System.out.println("You have ordered Playtime. Unit price: $100");
			break;
		case "CEO":
			System.out.println("You have ordered CEO. Unit price: $200");
			break;
		default:
			System.out.println("Invalid");
		}
	}
}
