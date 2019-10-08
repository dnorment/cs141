public class PetDriver{

	public static void main(String[] args){
		Pet pet1 = new Pet("Fido", "Dog", 5);
		Pet pet2 = new Pet("Max", "Cat", 3);
		Pet pet3 = new Pet("Charlie", "Horse", 6);

		pet1.setName("Bailey");
		pet2.setAnimal("Fish");
		pet3.setAge(11);

		System.out.println(pet1.getName() + " is a " + pet1.getAge() + " year old " + pet1.getAnimal());
		System.out.println(pet2.getName() + " is a " + pet2.getAge() + " year old " + pet2.getAnimal());
		System.out.println(pet3.getName() + " is a " + pet3.getAge() + " year old " + pet3.getAnimal());
	}

}
