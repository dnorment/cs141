public class CargoShip extends Ship {
	private int tonnage;
	
	public CargoShip(String n, String y, int t){
		super(n, y);
		tonnage = t;
	}
	
	public String toString(){
		return String.format("%s%n" + 
							 "Capacity: %d tons%n",
							 name, tonnage);
	}
}