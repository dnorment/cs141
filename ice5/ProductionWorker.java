public class ProductionWorker extends Employee {
	//inherits public methods from superclass
	
	private int shift;
	public static final int DAY_SHIFT = 1;
	public static final int NIGHT_SHIFT = 2;
	private double payRate;
	
	public ProductionWorker(String n, String eN, String hD, int s, double pR){
		super(n, eN, hD);
		shift = s;
		payRate = pR;
	}
	
	public ProductionWorker(){
		super(null, null, null);
		shift = 0;
		payRate = 0;
	}
	
	public void setShift(int s){
		shift = s;
	}
	
	public void setPayRate(double pR){
		payRate = pR;
	}
	
	public int getShift(){
		return shift;
	}
	
	public double getPayRate(){
		return payRate;
	}
	
	public String toString(){
		String s = shift == 1 ? "Day" : "Night";
		return String.format("Employee: %s%n" + 
							 "Employee Number: %s%n" + 
							 "Hire Date: %s%n" + 
							 "Shift: %s%n" + 
							 "Pay Rate : $%.2f/hr%n",
							 name, employeeNumber, hireDate, s, payRate);
	}
}