import java.io.*;
import java.util.Scanner;

public class TestScores {

	public static String determineGrade(double score){
		if (score < 60){
			return "F";
		} else if (score < 70){
			return "D";
		} else if (score < 80){
			return "C";
		} else if (score < 90){
			return "B";
		} else {
			return "A";
		}
	}

	public static double calcAverage(double s1, double s2, double s3, double s4, double s5){
		return (s1 + s2+ s3 + s4 + s5) / 5;
	}

	public static void main(String[] args) throws IOException{
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a filename: ");
		String filename = scnr.next();
		Scanner infile = new Scanner(new File(filename));
		double s1, s2, s3, s4, s5;
		s1 = infile.nextDouble();
		s2 = infile.nextDouble();
		s3 = infile.nextDouble();
		s4 = infile.nextDouble();
		s5 = infile.nextDouble();
		infile.close();
		System.out.println("Grade 1: " + s1 + " " + determineGrade(s1));
		System.out.println("Grade 2: " + s2 + " " + determineGrade(s2));
		System.out.println("Grade 3: " + s3 + " " + determineGrade(s3));
		System.out.println("Grade 4: " + s4 + " " + determineGrade(s4));
		System.out.println("Grade 5: " + s5 + " " + determineGrade(s5));
		double av = calcAverage(s1,s2,s3,s4,s5);
		System.out.println("Average: " + av + " " + determineGrade(av));
	}

}
