public class ParkingGarage implements Payable{

	private Car[][] cars;

	public ParkingGarage(int floors, int spaces){
		cars = new Car[floors][spaces];
	}

	public Car[][] getArray(){
		return cars;
	}

	public void getOverstayed(int hours){
		for (int i = 0; i < cars.length; i++){
			for (int j = 0; j < cars[0].length; j++){
				if (cars[i][j] != null){
					if (cars[i][j].getHoursPaidFor() < hours){
						System.out.println(cars[i][j]);
					}
				}
			}
		}
	}

	public void park(Car car, int floor, int spot){
		cars[floor][spot] = car;
	}

	public void leave(int floor, int spot){
		cars[floor][spot] = null;
	}

}
