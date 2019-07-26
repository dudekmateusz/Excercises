package objects.hospital;

public class Person {
	
	//pola
	private String name;
	private String lastName;
	private double salary;
	public String getName() {
		return name;
	}
	
	//konstruktor
	public Person(String name, String lastName, double salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	//gettery i settery
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getInfo() {
		return "Imię: "+name+", Nazwisko: "+lastName+", Wypłata: "+salary;
	}

	
	

}
