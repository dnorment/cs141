import java.util.Scanner;

public class TestScoresAndGrade{

	public static String getLetterGrade(double grade){
		if (grade <= 60) {
			return "F";
		} else if (grade < 70) {
			return "D";
		} else if (grade < 80) {
			return "C";
		} else if (grade < 90) {
			return "B";
		} else {
			return "A";
		}
	}

	public static void main(String[] args){
		double grade1, grade2, grade3, average = -1;
		Scanner scnr = new Scanner(System.in);
		do {
			System.out.print("Enter test score #1: ");
			grade1 = scnr.nextDouble();
		} while (grade1 < 0 || grade1 > 100);
		do {
			System.out.print("Enter test score #2: ");
			grade2 = scnr.nextDouble();
		} while (grade2 < 0 || grade2 > 100);
		do {
			System.out.print("Enter test score #3: ");
			grade3 = scnr.nextDouble();
		} while (grade3 < 0 || grade3 > 100);
		average = (grade1 + grade2 + grade3)/3;
		System.out.println("Average score: " + average);
		System.out.println("Letter grade: " + getLetterGrade(average));
	}
}
