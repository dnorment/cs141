//Daniel Norment
//CS141
//Project 2 – ParkingTicketSimulator
//April 20, 2017

public class ParkingTicket {

	private ParkedCar car;
	private PoliceOfficer officer;
	private double fine;
	private int minutes;
	private final double BASE_FINE = 25.0;
	private final double HOURLY_FINE = 10.0;

	public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min){
		car = aCar;
		officer = anOfficer;
		minutes = min;
	}
	
	public ParkingTicket(ParkingTicket ticket2){
		car = ticket2.car;
		officer = ticket2.officer;
		minutes = ticket2.minutes;
	}
	
	public void calculateFine(){
		fine = BASE_FINE + (HOURLY_FINE * Math.ceil(minutes / 60.0));
	}
	
	//todo: setters and getters
	
	public String toString(){
		calculateFine();
		return "" + car + officer + String.format("Minutes Illegally Parked: %d%n" + 
												"Fine: $%.2f%n",
												minutes, fine);
	}
	
}
