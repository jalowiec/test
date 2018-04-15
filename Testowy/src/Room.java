
public class Room {
	
	private final int roomNumber;
	private RoomState state;
	
	Room(int roomNumber){
		this.roomNumber = roomNumber;
	}
	
	public void setFree() {
	
		this.state = new RoomFree();	
		
	}
	
	public void setBooked() {
		
		this.state = new RoomBooked();	
		
	}
	
	public void setHolded() {
		
		this.state = new RoomHolded();	
		
	}
	
	
	
	public int getRoomNumber() {
		return roomNumber;
	}

	public RoomState getState() {
		return state;
	}
	
	
	
	
	

}
