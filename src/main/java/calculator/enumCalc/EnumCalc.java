package main.java.calculator.enumCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EnumCalc {
	
	private BufferedReader reader;
	
	public EnumCalc(InputStream in) {
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
		EnumCalc reader = new EnumCalc(System.in);
		final String AppName = "Kalkulator 4.0";
		
		System.out.println(AppName);
		
		while(true) {
			System.out.print("Wpisz działanie: ");
			for(CalcOptions item: CalcOptions.values()) {
				System.out.print(item+", ");	
			}
			double result;
			String line = reader.readString();
			String[] val = line.split("[ ,+,\\-,*,/]");
			CalcOptions option = CalcOptions.getOptionByTxt(val[0]);
			switch(option) {
			case DODAJ: result = Double.valueOf(val[1])+Double.valueOf(val[val.length-1]);
				System.out.println(result);
				break;
			case ODEJMIJ: result = Double.valueOf(val[1])-Double.valueOf(val[val.length-1]);
				System.out.println(result);
				break;
			case POMNOZ: result = Double.valueOf(val[1])*Double.valueOf(val[val.length-1]);
				System.out.println(result);
				break;
			case PODZIEL: result = Double.valueOf(val[1])/Double.valueOf(val[val.length-1]);
				System.out.println(result);
				break;
			}
			
			System.out.println("Czy chcesz przerwać?[t/n]");
			Scanner finish = new Scanner (System.in);
			String last = finish.nextLine();
			if(last.toLowerCase().equals("t")) {
				break;
			}
		}

	}

}
