package objects.computers;

public class Notebook extends Computer{

	private int batteryCapacity; //pojemność baterii mAh
	
	//konstruktor
	public Notebook(double cpuTemperature, int ramMemory, int batteryCapacity) {
		super(cpuTemperature, ramMemory);//wywołanie konstruktora z klasy Computer
		this.batteryCapacity = batteryCapacity;
		
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	public void coolDown() {
		super.coolDown();
		turboCool();
	}
	
	private void turboCool() {
		setCpuTemperature(getCpuTemperature() - 2);
	}
}
