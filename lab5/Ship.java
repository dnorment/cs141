public class Ship {
	protected String name;
	private String year;
	
	public Ship(String n, String y){
		name = n;
		year = y;
	}
	
	public String toString(){
		return String.format("%s%n" + 
							 "Built in %s%n",
							 name, year);
	}
}