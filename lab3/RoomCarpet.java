public class RoomCarpet{

	private RoomDimension dims;
	private double costPerSqFoot;

	public RoomCarpet(RoomDimension room, double cost){
		dims = room;
		costPerSqFoot = cost;
	}

	public double getCost(){
		return dims.getArea() * costPerSqFoot;
	}

}
