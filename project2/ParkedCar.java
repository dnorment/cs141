//Daniel Norment
//CS141
//Project 2 – ParkingTicketSimulator
//April 20, 2017

public class ParkedCar {

	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private int minutesParked;
	
	public ParkedCar(String mk, String mod, String col, String lic, int min){
		make = mk;
		model = mod;
		color = col;
		licenseNumber = lic;
		minutesParked = min;
	}
	
	public ParkedCar(ParkedCar car2){
		make = car2.make;
		model = car2.model;
		color = car2.color;
		licenseNumber = car2.licenseNumber;
		minutesParked = car2.minutesParked;
	}
	
	public int getMinutesParked(){
		return minutesParked;
	}
	//todo: setters and getters
	
	public String toString(){
		return String.format("Car Data: %n" + 
							"Make: %s%n" + 
							"Model: %s%n" + 
							"Color: %s%n" + 
							"License Number: %s%n" + 
							"Minutes Parked: %d%n",
							make, model, color, licenseNumber, minutesParked);
	}

}
