class Booking{
//private class with methods
	private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable;

    static { //using static for the available seats in the arena
    	seatsAvailable = 1000;
    }


    //set the constructor to access the private methods
    public Booking(String customerEmail, int seatsRequired) {
		super();
		this.customerEmail = customerEmail;
		this.seatsRequired = seatsRequired;

		if (seatsRequired <= seatsAvailable) { //conditional to show booked
			this.isBooked = true;
		} else {
			this.isBooked = false;
		}
	}


//Getter and Setters for private
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





class Tester { //Tester main program
    public static void main(String[] args) {
        Booking booking1 = new Booking("Lily@email.com", 450);
        Booking booking2 = new Booking("james@email.com", 200);
        Booking booking3 = new Booking("mr@email.com", 700);

        

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
