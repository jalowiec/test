import java.util.ArrayList;
import java.util.List;

public class Hotel {
	
	private List<Room> roomList = new ArrayList<>();
	
		
	public void addRoom(int roomNumber) {
		Room addedRoom = new Room(roomNumber);
		addedRoom.setFree();
		roomList.add(addedRoom);
		//TODO - obs³uga podwojnego dodawania pokoju
	}
	
	public Room getRoom(int roomNumber) {
		
		for(Room element : roomList) {
			if(element.getRoomNumber() == roomNumber) 
				return element;
			
		}
		return null;
	}
	
	public void roomsDisplay() {
		for(Room element : roomList) {
			System.out.print(element.getRoomNumber() + " ");
			element.getState().stateDescription();
		}
		
		
		
	}

}
