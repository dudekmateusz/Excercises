package objects.employees;

public class StaticTest {

	public static void main(String[] args) {
		
		//Wstawienie do tablicy staff trzech objektów reprezentujących pracowników		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Robert", 3000);
		staff[1] = new Employee("Ala", 4000);
		staff[2] = new Employee("Dariusz", 1000);
		//drukowanie informacji o wszystkich obiektach klasy Employee
		for (Employee e: staff) {
			e.setId();
			System.out.println("imię= "+ e.getName()+", id= "+ e.getId()+", wypłata= "+ e.getSalary());
		}
		int n = Employee.getNextId();//wywołanie metody statycznej
		System.out.println("Następny dostępny identyfikator = "+ n);
	}

}
