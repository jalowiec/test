import java.util.Date;

public class RoomHolded implements RoomState {
	
	private Person holdingPerson;
	private Date holdingDate;
	
	RoomHolded(Person holdingPerson, Date holdingDate){
		this.holdingPerson = holdingPerson;
		this.holdingDate = holdingDate;
		
	}

		
	public Person getHoldingPerson() {
		return holdingPerson;
	}


	public Date getHoldingDate() {
		return holdingDate;
	}



	public void stateDescription() {
		System.out.println("ZAREZERWOWANY (" + holdingPerson.getPersonName() + " " + holdingPerson.getPersonSurname() + " " + holdingDate + ")");
		
	} 

}
