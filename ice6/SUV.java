public class SUV extends Car{

	public SUV(int h, int y, String b){
		super(h, y, b);
	}

	public void setYear(int y){
		year = y;
	}

	public void setBrand(String b){
		brand = b;
	}

	public int getYear(){
		return year;
	}

	public String getBrand(){
		return brand;
	}

}
