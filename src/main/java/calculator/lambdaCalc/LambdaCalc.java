package main.java.calculator.lambdaCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LambdaCalc {
	private BufferedReader reader;
	
	public LambdaCalc(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
	}
	public String readString() {
		try {
			return reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		LambdaCalc reader = new LambdaCalc(System.in);
		final String AppName = "Kalkulator 4.0";
		
		System.out.println(AppName);
		
		while(true) {
			System.out.print("Wpisz działanie: ");
			
			
			String line = reader.readString();
			String[] val = line.split(" ");
			CalcFunction option = LambdaEnum.getOptionBySign(val[1]);
			
			double p1=Double.valueOf(val[0]);
			double p2 = Double.valueOf(val[2]);
			
			if(option!=null) {
			double result = option.calculate(p1,p2);
			System.out.println(result);
			}
			
			System.out.println("Czy chcesz przerwac?[t/n]");
			String last = reader.readString();
			if(last.toLowerCase().equals("t")) {
				break;
			}
		}

	}

}
