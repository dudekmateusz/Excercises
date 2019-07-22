package objects.employees;

public class Employee {
	private static int nextId;
	
	private String name;
	private double salary;
	private int id = assignId();
	
	private static int assignId() {
		int r = nextId;
		nextId++;
		return r;
	}
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
		id = 0;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		id = nextId;
		nextId++;
	}
	public static int getNextId() {
		return nextId;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Grzegorz", 5000);
		System.out.println(e.getName()+" "+e.getSalary());
	}

}
