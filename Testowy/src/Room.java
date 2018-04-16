import java.util.Date;

public class Room {
	
	private final int roomNumber;
	private RoomState state;
	
	Room(int roomNumber){
		this.roomNumber = roomNumber;
	}
	
	public void setFree() {
	
		this.state = new RoomFree();	
		
	}
	
	public void setBooked(Person bookingPerson) {
		
		this.state = new RoomBooked(bookingPerson);
		
		
	}
	
	public void setHolded(Person holdingPerson, Date holdingDate) {
		
		this.state = new RoomHolded(holdingPerson, holdingDate);	
		
	}
	
	
	
	public int getRoomNumber() {
		return roomNumber;
	}

	public RoomState getState() {
		return state;
	}
	
	
	
	
	

}
