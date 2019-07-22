package objects.carParts;

public class ShowParts {

	public static void main(String[] args) {
		Part lampaFiatStilo = new Part(1, "Fiat", "Stilo", 44234454);
		Part drzwiStilo = new Part(4, "Fiat", "Prawe Przód", 44549922);
		Tire dunlop = new Tire(54, "Dunlop", "Blueberry", 45674392,"205/55",16);
		Tire michelin = new Tire(53, "Michelin", "FatBoy", 43230090,"195/55",15);
		Wheel oz = new Wheel(14, "OZ", "SpeedLine", 45904252, "205/55", 16);
		Wheel rial = new Wheel(38, "RIAL", "Lucca Black Gloss", 44789054, "205/55", 16);
		ExhaustPart ruraWylotowaTłumika = new ExhaustPart(24, "Rurociąg", "ładna rura", 45879213, false);
		ExhaustPart resorUkładuWydechowego = new ExhaustPart(11, "Resoraki", "dobry resor", 43164213, true);
		
		System.out.println(lampaFiatStilo);
		System.out.println(drzwiStilo);
		System.out.println(dunlop);
		System.out.println(michelin);
		System.out.println(oz);
		System.out.println(rial);
		System.out.println(ruraWylotowaTłumika);
		System.out.println(resorUkładuWydechowego);

	}

}
