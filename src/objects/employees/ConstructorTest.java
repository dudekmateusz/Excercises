package objects.employees;

public class ConstructorTest {

	public static void main(String[] args) {
		//wstawienie do tablic staff trzech obiektów klasy Employee1
		Employee1[] staff = new Employee1[3];
		
		staff[0] = new Employee1("Hubert", 4000);
		staff[1] = new Employee1(3000);
		staff[2] = new Employee1();
		
		//wydruk informacji o wszystkich obiektach klasy Employee1
		for (Employee1 e:staff) {
			System.out.println("imię = "+ e.getName()+" id = "+e.getId()+" wypłata = "+e.getSalary());
		}
	}

}
