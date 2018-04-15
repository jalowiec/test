import java.util.Date;

public class RoomHolded implements RoomState {
	
	private Person holdingPerson;
	private Date holdingDate = new Date();
	
	public void stateDescription() {
		System.out.println("ZAREZERWOWANY");
	//	System.out.println(holdingPerson.getPersonName() + " " + holdingPerson.getPersonSurname());
	//	System.out.println(holdingDate);
	} 

}
