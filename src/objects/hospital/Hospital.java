package objects.hospital;

public class Hospital {
	
	//stała określająca maksymalną liczbę pracowników
	private static final int MAX_EMPLOYEES=3;
	
	private Person[] employees = new Person [MAX_EMPLOYEES];
	private int employeesNumber;
	
	//gettery i settery
	public Person[] getEmployees() {
		return employees;
	}
	public void setEmployees(Person[] employees) {
		this.employees = employees;
	}
	public int getEmployeesNumber() {
		return employeesNumber;
	}
	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}
	
	//metoda dodająca nowego pracownika do tablicy pracowników 
	public void add (Person person) {
		if (getEmployeesNumber()<MAX_EMPLOYEES) {
			getEmployees()[getEmployeesNumber()]=person;
			setEmployeesNumber(getEmployeesNumber()+1);
		}
	}
	
	public String getInfo() {
		String result = "";
		for(int i=0;i<employeesNumber;i++) {
			result = result +employees[i].getInfo()+"\n";
		
		}
		return result;
	}

}
