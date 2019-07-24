package objects.computers;

/**
 * pakiet jest ćwiczeniem na wykorzystywanie konstrukcji super();
 * @author Mateusz Dudek
 *
 */

public class Computer {

	private double cpuTemperature; //temp procesora
	private int ramMemory; //MB
	
	//konstruktor
	public Computer(double cpuTemperature, int ramMemory) {
		this.cpuTemperature = cpuTemperature;
		this.ramMemory = ramMemory;
	}

	public double getCpuTemperature() {
		return cpuTemperature;
	}

	public void setCpuTemperature(double cpuTemperature) {
		this.cpuTemperature = cpuTemperature;
	}

	public int getRamMemory() {
		return ramMemory;
	}

	public void setRamMemory(int ramMemory) {
		this.ramMemory = ramMemory;
	}
	
	public void coolDown() {
		cpuTemperature = cpuTemperature -1;
	}
	
}
