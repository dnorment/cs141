//Daniel Norment
//CS141
//Project 2 – ParkingTicketSimulator
//April 20, 2017

public class PoliceOfficer {

	private String name;
	private String badgeNumber;
	
	public PoliceOfficer(String n, String bn){
		name = n;
		badgeNumber = bn;
	}
	
	public PoliceOfficer(PoliceOfficer officer2){
		name = officer2.name;
		badgeNumber = officer2.badgeNumber;
	}
	
	public ParkingTicket patrol(ParkedCar car, ParkingMeter meter){
		if (car.getMinutesParked() > meter.getMinutesPurchased()){
			return new ParkingTicket(car, this, car.getMinutesParked() - meter.getMinutesPurchased());
		} else {
			return null;
		}
	}
	
	//todo: setters and getters
	
	public String toString(){
		return String.format("Officer Data: %n" + 
							"Name: %s%n" + 
							"BadgeNumber: %s%n", 
							name, badgeNumber);
	}

}
