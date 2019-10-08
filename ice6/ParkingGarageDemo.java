public class ParkingGarageDemo{

	public static void main(String[] args){

		ParkingGarage pg = new ParkingGarage(4, 100);
		Car c1 = new Sedan(3, 1999, "Toyota");
		Car c2 = new SUV(5, 2008, "Honda");

		pg.park(c1, 0, 3);
		pg.park(c2, 1 ,20);

		System.out.println("Overstayed cars: ");
		pg.getOverstayed(4);

	}

}
