import java.util.ArrayList;
import java.util.List;

public class Hotel {
	
	private List<Room> roomList = new ArrayList<>();
	private List<Person> personList = new ArrayList<>();
	
	
		
		
	public void addRoom(int roomNumber) {
		Room addedRoom = new Room(roomNumber);
		addedRoom.setFree();
		roomList.add(addedRoom);
		//TODO - obs³uga podwojnego dodawania pokoju
	}
	

	public void addPerson(int personId, String personName, String personSurname) {
		personList.add(new Person(personId, personName, personSurname));
		//TODO - obs³uga podwojnego dodawania osoby
	}
	
	
	
	public Room getRoom(int roomNumber) {
		
		for(Room element : roomList) {
			if(element.getRoomNumber() == roomNumber) 
				return element;
			
		}
		return null;
	}
	
	public Person getPerson(int personId) {
		
		for(Person element : personList) {
			if(element.getPersonId() == personId) 
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
