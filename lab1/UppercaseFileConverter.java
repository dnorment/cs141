import java.io.*;
import java.util.Scanner;

public class UppercaseFileConverter{
	public static void main(String[] args) throws IOException{
		String inFile, outFile;
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter the input file name: ");
		inFile = scnr.next();
		System.out.print("Enter the output file name: ");
		outFile = scnr.next();
		Scanner inputFile = new Scanner(new File(inFile));
		PrintWriter output = new PrintWriter(outFile);
		while (inputFile.hasNext()){
			output.println(inputFile.next().toUpperCase());
		}
		output.close();
	}
}
