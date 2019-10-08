public abstract class Car{

	private int hoursPaidFor;
	protected int year;
	protected String brand;

	public Car(int h, int y, String s){
		hoursPaidFor = h;
		year = y;
		brand = s;
	}

	public abstract void setYear(int y);
	public abstract void setBrand(String b);

	public void setHours(int hours){
		hoursPaidFor = hours;
	}

	public int getHoursPaidFor(){
		return hoursPaidFor;
	}

	public String toString(){
		return "" + year + " " + brand + ": paid for " + hoursPaidFor + " hours";
	}

}
