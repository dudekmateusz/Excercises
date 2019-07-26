package objects.hospital;

public class HospitalApp {

	public static void main(String[] args) {
	
		Hospital hospital = new Hospital();
		
		hospital.add(new Doctor("Jan", "Kowalski", 5000, 500));
		hospital.add(new Nurse("Zofia", "Krzaklewska", 3000, 15));
		hospital.add(new Nurse("Kasia", "Stępień", 3500, 20));
		hospital.add(new Nurse("Karolina", "Zawadzka", 2000, 5));
		
		System.out.println("Pracownicy szpitala: ");
		System.out.println(hospital.getInfo());

	}

}
