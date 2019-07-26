package objects.animals;

public class Zoo {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3]; 
		animals[0]=new Dog ("Burek");
		animals[1] = new Cat ("Mruczek");
		animals[2] = new Animal ("Kotopies");
		
		((Dog)animals[0]).bark();
		
		changeAnimalName(animals[0],"Pieseł");
		
		for(Animal animal:animals) {
			animal.giveSound();
		}

	}
	
	private static void changeAnimalName(Animal animal, String newName) {
		animal.setName(newName);
	}

}
