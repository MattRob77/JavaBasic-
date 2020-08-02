class Booking{

	private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable;

    static {
    	seatsAvailable = 1000;
    }



    public Booking(String customerEmail, int seatsRequired) {
		super();
		this.customerEmail = customerEmail;
		this.seatsRequired = seatsRequired;

		if (seatsRequired <= seatsAvailable) {
			this.isBooked = true;
		} else {
			this.isBooked = false;
		}
	}



	public String getCustomerEmail() {
		return customerEmail;
	}



	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}



	public int getSeatsRequired() {
		return seatsRequired;
	}



	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}



	public boolean isBooked() {
		return isBooked;
	}



	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}



	public static int getSeatsAvailable() {
		return seatsAvailable;
	}



	public static void setSeatsAvailable(int seatsAvailable) {
		Booking.seatsAvailable = seatsAvailable;
	}

 }





class Tester {
    public static void main(String[] args) {
        Booking booking1 = new Booking("Lily@email.com", 450);
        Booking booking2 = new Booking("james@email.com", 200);
        Booking booking3 = new Booking("mr@email.com", 700);

        //Create more objects and add them to the bookings array for testing your code

        Booking[] bookings = { booking1, booking2, booking3 };

        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(booking.getSeatsRequired()+" seats successfully booked for "+booking.getCustomerEmail());
            }
            else {
                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
                System.out.println("Seats available: "+Booking.getSeatsAvailable());
            }
         }
    }
}
