package objects.employees;

import java.util.Random;

public class Employee1 {
	private static int nextId;
	
	private int id;
	private String name = ""; //inicjalizacja zmiennej składowej obiektu
	private double salary;
	
	//statyczny blok inicjujący
	static {
		Random generator = new Random();
		//ustawienie zmiennej nextId na losową liczbę całkowitą z przedziału 0-9999
		nextId = generator.nextInt();
	}
	//blok inicjujący obiektów
	{
		id = nextId;
		nextId++;
	}
	
	//trzy konstruktory przeciążone
	public Employee1(String n, double s) {
		name = n;
		salary = s;
	}
	
	public Employee1(double s) {
		//wywołanie konstruktora Employee(String, double)
		this("Employee1 #"+nextId, s);
	}
	//konstruktor domyślny
	public Employee1() {
		//zmienna name zainicjalizowana wartością ""
		//zmienna salary nie jest jawnie ustawiona - inicjalizacja wartością 0
		//zmienna id jest inicjalizowana w bloku inicjującym
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

}
