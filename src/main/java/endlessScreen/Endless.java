package main.java.endlessScreen;

import java.util.Scanner;

public class Endless implements Appendable{
	Object[] tab = {1};
	
	@Override
	public Appendable append(Object item) {
		//dodanie kolejnego elementu do kolekcji
		//param item Nowy element kolekcji
		Object[]tmp=new Object[tab.length+1]; 
		for(int i=0;i<tab.length;i++) {
			tmp[i]=tab[i];
			
			tmp[tab.length]=item;	
		}tab=tmp;
		
		return this;
	}

	@Override
	public Appendable append(Object item, int index) {
		tab[index] = item;
		//dodanie elementu na podana pozycje, jezeli na danej pozycji jest juz element zostanie zamieniony
		//@param item Wrzucany element
		Scanner reader = new Scanner(System.in);
		System.out.println("Podaj jaki element ma zostać dodany do tablicy: ");
		item=reader.nextLine();
		System.out.println("Podaj w którym miejscu tablicy element ma zostać dodany: ");
		index = reader.nextInt();
		Object[] tmp = new Object[tab.length];
		for(int i = 0; i<tab.length; i++) {
			tmp[i]=tab[i];
			tmp[index]=tab[i];
		}tmp[index]=item;
		tab=tmp;
		return this;
		//@param index Pozycja elementu
		//return Powekszana kolekcja
	}

	@Override
	public Object get(int index) {
	
		return tab[index];
	}
	
	public void PrintTab(Object item) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print("["+get(i)+"]");
		}
		System.out.println();
	}
}
