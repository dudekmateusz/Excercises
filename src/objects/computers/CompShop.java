package objects.computers;

public class CompShop {

	public static void main(String[] args) {
		Computer computer = new Computer(50, 256);
		Notebook toshiba = new Notebook(60, 512, 4000);
		
		System.out.println("Komputer stacjonarny: ");
		System.out.println("Temperatura procesora: ");
		System.out.println(computer.getCpuTemperature());
		System.out.println("Schładzam procesor...");
		computer.coolDown();
		System.out.println(computer.getCpuTemperature());
		System.out.println("Laptop Toshiba");
		System.out.println("Parametry: ");
		System.out.println("Temperatura procesora:"+toshiba.getCpuTemperature()+
				", Pamięć RAM: "+toshiba.getRamMemory()+"MB, Pojemność baterii: "+toshiba.getBatteryCapacity()+"mAh");
		System.out.println("Schładzam laptop");
		toshiba.coolDown();
		System.out.println("Aktualna temperatura procesora: "+toshiba.getCpuTemperature());

	}

}
