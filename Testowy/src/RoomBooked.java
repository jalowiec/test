
public class RoomBooked implements RoomState {
	
	private Person bookingPerson;

	
	RoomBooked(Person bookingPerson){
		this.bookingPerson = bookingPerson;
	}


	public Person getBookingPerson() {
		return bookingPerson;
	}

	public void stateDescription() {
		System.out.println("ZAJETY (" + bookingPerson.getPersonName() + " " + bookingPerson.getPersonSurname() + ")");
		
	} 

}
