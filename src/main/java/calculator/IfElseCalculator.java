package main.java.calculator;

import java.util.Scanner;

public class IfElseCalculator {

	public static void main(String[] args) {
	final String AppName = "Kalkulator 2.0";
		
		System.out.println(AppName);
		Scanner reader = new Scanner (System.in);
		System.out.println("Wpisz dzialanie (suma, roznica, iloczyn, iloraz): ");
		
		int first = reader.nextInt();
		char operator = reader.next().charAt(0);
		int second = reader.nextInt();
		
		int result = 0;
		
		if(operator == '+') {
			result = first + second;
		}else if(operator =='-') {
			result = first - second;
		}else if(operator == '*') {
			result = first*second;
		}else if(operator == '/') {
			result = first/second;
		}else {
			System.out.println("Wystapil‚ blad!");
		}
		System.out.println(result);
	}

}
