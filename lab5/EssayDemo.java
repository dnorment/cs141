public class EssayDemo {
	public static void main(String[] args){
		Essay termPaper = new Essay();
		termPaper.setScore(25.0, 18.0, 20.0, 25.0);
		
		System.out.println("Term paper:");
		System.out.println("Grammar points: " + termPaper.getGrammar());
		System.out.println("Spelling points: " + termPaper.getSpelling());
		System.out.println("Length points: " + termPaper.getCorrectLength());
		System.out.println("Content points: " + termPaper.getContent());
		System.out.println("Total points: " + termPaper.getScore());
		System.out.println("Grade: " + termPaper.getGrade());
 }
}
