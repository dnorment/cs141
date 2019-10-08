public class CruiseShip extends Ship {
	private int maxPassengers;
	
	public CruiseShip(String n, String y, int mP){
		super(n, y);
		maxPassengers = mP;
	}
	
	public String toString(){
		return String.format("%s%n" + 
							 "Capacity: %d passengers%n",
							 name, maxPassengers);
	}
}