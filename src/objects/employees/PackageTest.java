package objects.employees;

import static java.lang.System.*;

public class PackageTest {

	public static void main(String[] args) {
		
		Employee2 harry = new Employee2("Hubert Kowalski", 5000, 1989, 11, 18);
		harry.raiseSalary(5);
		
		out.println("imię = "+harry.getName()+", wypłata = "+harry.getSalary()+", rok = "+ harry.getHireDay());

	}

}
