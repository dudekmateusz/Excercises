package main.java.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
	
		final String AppName = "Kalkulator 1.0";
		
		System.out.println(AppName);
		
		Scanner reader = new Scanner (System.in);
		//reader.useDelimiter("\r\n");
		
		while(true) {
		System.out.println("Wpisz dzialanie (suma, roznica, iloczyn, iloraz): ");
		
		int first = 0;
		int second = 0;
		try {
			first = reader.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("1.Wpisz liczbe");
		}
		String operator = null;
		try {
		operator = reader.next();
		}catch(InputMismatchException e) {
			System.out.println("Wpisz operator");
		}
		try {
		second = reader.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("2.Wpisz druga liczbe");
		}
		
		int result = 0;
	
		
		switch(operator)
		{
		case "+":
			result = first + second;
			break;
	
		case "-":
			result = first - second;
			break;
		case "/":
			result = first/second;
			break;
		case "*":
			result = first*second;
			break;
			default:
				System.out.println("Nie wpisales prawidlowo dzialania!");
	
		}
		System.out.println("Wynik dzialania:" +result);
		System.out.println("Czy chcesz przerwac[t/n]");
		Scanner finish = new Scanner (System.in);
		String last = finish.nextLine();
	if(last.toLowerCase().equals("t")) {
		break;
	
			}
		}
}
}
