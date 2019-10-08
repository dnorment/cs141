import java.util.Scanner;

public class CarpetDriver{

	public static void main(String[] args){

		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter room length: ");
		double len = scnr.nextDouble();
		System.out.print("Please enter room width: ");
		double wid = scnr.nextDouble();
		System.out.print("Please enter cost per square foot: ");
		double cpsf = scnr.nextDouble();
		
		RoomDimension dimension = new RoomDimension(len, wid);
		RoomCarpet carpet = new RoomCarpet(dimension, cpsf);
		
		System.out.printf("Total cost: $%.2f%n", carpet.getCost());
		
	}

}
