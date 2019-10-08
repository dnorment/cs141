public class Pet{

	private String name;
	private String animal;
	private int age;

	public Pet(String n, String a, int y){
		name = n;
		animal = a;
		age = y;
	}

	public Pet(){
		name = "";
		animal = "";
		age = 0;
	}

	public void setName(String n){
		name = n;
	}

	public void setAnimal(String a){
		animal = a;
	}

	public void setAge(int y){
		age = y;
	}

	public String getName(){
		return name;
	}

	public String getAnimal(){
		return animal;
	}

	public int getAge(){
		return age;
	}

}
