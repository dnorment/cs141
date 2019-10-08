import java.util.Scanner;

public class WordGame{
	public static void main(String[] args){
		int age;
		String name, city, college, profession, animal, petName;
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = scnr.next();
		do {
			System.out.print("Enter your age: ");
			age = scnr.nextInt();
		} while (age < 0 || age > 120);
		System.out.print("Enter the name of a city: ");
		city = scnr.next();
		System.out.print("Enter the name of a college: ");
		college = scnr.next();
		System.out.print("Enter profession: ");
		profession = scnr.next();
		System.out.print("Enter a type of animal: ");
		animal = scnr.next();
		System.out.print("Enter a pet name: ");
		petName = scnr.next();

		System.out.println("There once was a person named " + name +
		" who lived in " + city + ". At the age of " + age + ", " + name +
		" went to college at " + college + ". " + name + " graduated and went to work as a " + profession +
		". Then, " + name + " adopted a(n) " + animal + " named " + petName +
		". They both lived happily ever after!");
	}
}
