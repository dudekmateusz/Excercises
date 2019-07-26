package objects.hospital;

public class Nurse extends Person{
	
	//pola
	private int overtime;
	
	//konstruktor
	public Nurse(String name, String lastName, double salary, int overtime) {
		super(name, lastName, salary);
		this.setOvertime(overtime);
		
	}
	
	//gettery i settery
	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	@Override
	public String getInfo() {
		return super.getInfo()+", Nadgodziny: "+overtime;
	}

	
	

}
