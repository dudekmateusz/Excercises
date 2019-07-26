package objects.hospital;

public class Doctor extends Person{
	
	//pola
	private double bonus;

	//konstruktor
	public Doctor(String name, String lastName, double salary, double bonus) {
		super(name, lastName, salary);
		this.setBonus(bonus);
	
	}
	//gettery i settery
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+", Premia: "+bonus;
	}

	
}
