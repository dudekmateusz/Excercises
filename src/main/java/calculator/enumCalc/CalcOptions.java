package main.java.calculator.enumCalc;

public enum CalcOptions {

	DODAJ,ODEJMIJ,POMNOZ,PODZIEL;
	
	public static CalcOptions getOptionByTxt(String txt) {
		for(CalcOptions item : CalcOptions.values()) {
			if(item.name().equalsIgnoreCase(txt)) {
				return item;
			}
		}

		return null;
	}
}
