public class Essay extends GradedActivity {
	
	public Essay(){
		
	}
	
	public void setScore(double g, double s, double cL, double c){
		super.setScore(g, s, cL, c);
	}
	
	public double getGrammar(){
		return grammar;
	}

	public double getSpelling(){
		return spelling;
	}

	public double getCorrectLength(){
		return correctLength;
	}

	public double getContent(){
		return content;
	}	
	
	
}