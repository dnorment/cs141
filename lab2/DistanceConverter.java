import java.util.Scanner;

public class DistanceConverter{

	public static void showKilometers(double m){
		double km = m * 0.001;
		System.out.println(m + " meters is " + km + " kilometers.");
	}

	public static void showInches(double m){
		double in = m * 39.37;
		System.out.println(m + " meters is " + in + " inches.");
	}

	public static void showFeet(double m){
		double ft = m * 3.281;
		System.out.println(m + " meters is " + ft + " feet.");
	}

	public static void menu(){
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
	}

	public static void main(String[] args){
		double meters;
		int choice;
		Scanner scnr = new Scanner(System.in);
		do{
			System.out.print("Enter a distance in meters: ");
			meters = scnr.nextDouble();
			if (meters < 0){
				System.out.println("Please enter a positive number");
			}
		} while (meters < 0);
		do{
			menu();
			System.out.print("Enter your choice: ");
			choice = scnr.nextInt();
			switch (choice){
				case 1:
					showKilometers(meters);
					break;
				case 2:
					showInches(meters);
					break;
				case 3:
					showFeet(meters);
					break;
			}
			if (choice < 1 || choice > 4){
				System.out.println("Invalid selection.");
			}
		} while (choice != 4);
		System.out.println("Bye!");
	}
}
