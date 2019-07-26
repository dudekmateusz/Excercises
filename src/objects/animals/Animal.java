package objects.animals;

public class Animal {
	private String name;

	//konstruktor
	public Animal(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void giveSound() {
		System.out.println("Jestem zwierzęciem i nazywam się "+getName());
	}

}
