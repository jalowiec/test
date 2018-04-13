
public class RoomBooked implements RoomState {
	
	private Person bookingPerson;
	
	public void stateDescription() {
		System.out.println("ZAJETY");
		System.out.println(bookingPerson.getPersonName() + " " + bookingPerson.getPersonSurname());
	} 

}
