package main.java.calculator.objectCalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ObjectCalc {

		private final String AppName = "Kalkulator 3.0";
		
		public void DataReader(){
		Scanner reader = new Scanner (System.in);
		//reader.useDelimiter("\r\n");
		
		while(true) {
		System.out.println("Wpisz dzialanie (suma, roznica, iloczyn, iloraz): ");

		int first = 0;
		String operator = null;
		int second = 0;
		try{
		first =	reader.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("1.Wpisz liczbe");
		}
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
		System.out.println("Czy chcesz przerwac?[t/n]");
		Scanner finish = new Scanner (System.in);
		String last = finish.nextLine();
	if(last.toLowerCase().equals("t")) {
		break;

			}
		}
		return;
}
}

