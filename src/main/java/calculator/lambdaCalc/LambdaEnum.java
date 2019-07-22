package main.java.calculator.lambdaCalc;


public enum LambdaEnum {
DODAJ("+"),ODEJMIJ("-"),POMNOZ("*"),PODZIEL("/");
	
	private String sign;
	
	private LambdaEnum(String sign) {
		this.sign=sign;
	}
	
	public String getSign() {
		return sign;
	}
	
	public static CalcFunction getOptionBySign(String sign) {
		for(LambdaEnum item : LambdaEnum.values()) {
			if(sign.equalsIgnoreCase(item.getSign())) {
				switch(item) {
				case DODAJ: 
					return (a,b)-> a + b; 
				case ODEJMIJ:
					return (a,b) -> a - b;
				case POMNOZ:
					return (a,b) -> a * b;
				case PODZIEL:
					return (a,b) -> a / b;
				}
			}
		}

		return null;
	}

}
