
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Person(1, "Jan", "Kowalski");
		new Person(2, "Marek", "Nowak");
		new Person(3, "Tadeusz", "Wybitny");
		
		Hotel hotel = new Hotel();
		
		
		hotel.addRoom(1);
		hotel.addRoom(2);
		hotel.addRoom(3);
		
		hotel.getRoom(2).setHolded();			
		
				
		hotel.roomsDisplay();
		

	}

}



