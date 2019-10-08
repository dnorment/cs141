public class Car{
	private String make;
	private String model;
	private int year;

	public Car(String mk, String md, int yr){
		make = mk;
		model = md;
		year = yr;
	}

	public int getAge(){
		return year;
	}

	public boolean equals(Car c2){
		return make.equals(c2.make) && model.equals(c2.model) && year == c2.year;
	}

	public void setMake(String mk){
		make = mk;
	}
	public void setModel(String md){
		model = md;
	}
	public Car (Car c2){
		make = c2.make;
		model = c2.model;
		year = c2.year;
	}

	public Car(){
		make = "Toyota";
		model = "Corolla";
		year = 2017;
	}
	public void setYear (int yr){
		year = yr;
	}
	public String toString(){
		String str = year + " " + make + " " + model;
		return str;
	}
	public void compareYear(Car c2){
		if (year < c2.year){
			System.out.println("The " + c2 + " is older than the " + toString());
		} else if (c2.year < year){
			System.out.println("The " + toString() + " is older than the " + c2);
		} else {
			System.out.println("They are the same year");
		}
	}
}





