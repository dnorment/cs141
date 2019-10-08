//Daniel Norment
//CS141
//Project 2 – ParkingTicketSimulator
//April 20, 2017

public class ParkingMeter {
	
	private int minutesPurchased;
	
	public ParkingMeter(int m){
		minutesPurchased = m;
	}
	
	public void setMinutesPurchased(int m){
		minutesPurchased = m;
	}
	
	public int getMinutesPurchased(){
		return minutesPurchased;
	}
	
}
