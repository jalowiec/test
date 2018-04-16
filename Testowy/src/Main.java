import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hotel hotel = new Hotel();
		
		hotel.addRoom(1);
		hotel.addRoom(2);
		hotel.addRoom(3);
		
		hotel.addPerson(1, "Jan", "Kowalski");
		hotel.addPerson(2, "Tadeusz", "Nowak");
		
		hotel.getRoom(2).setHolded(hotel.getPerson(2), new Date());
		hotel.getRoom(3).setBooked(hotel.getPerson(1));
		
				
		hotel.roomsDisplay();
		

	}

}




