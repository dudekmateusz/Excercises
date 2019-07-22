package main.java.arrays;

import java.util.Arrays;

public class EasyTable {

	public static void main(String[] args) {
		
		int[]table = {1,2,3,4,5};
		int[]temp = new int[table.length +10];
		System.out.println("Tablica oryginalna: " + table.length);
		System.out.println("Dlugosc nowej tablicy: "+temp.length);
		for(int i=0;i<table.length;i++) {
			table[i]=i+1;
			for(i=0;i<table.length;i++) {
				temp[i]=table[i];
			}
		}
		for(int i=0;i<temp.length;i++) {
			
			if(i<table.length) {
					temp[i]=table[i];
			System.out.print(temp[i]+" ");
			}else {
				System.out.print(temp[i]+" ");
			}
		
		}
		System.out.println();
			System.out.println("Wartosc indexu nr 8: "+temp[8]);
			
			int[] liczby = {2,3,4,5,6};
			System.out.println("Wyswietlenie listy tablicy \"liczby\":"+Arrays.toString(liczby));
			System.out.println("Wyswietlenie listy tablicy\"table\":"+Arrays.toString(table));
			System.out.println("Wyswietlenie listy nowej tablicy\"temp\":"+Arrays.toString(temp));
			int[]kopiaLiczb = Arrays.copyOf(liczby, liczby.length);
			System.out.println("Kopia tablicy \"liczby\":"+Arrays.toString(kopiaLiczb));
			int[]kopiaLiczbWiększaO5 = Arrays.copyOf(liczby, liczby.length+5);
			System.out.println("Kopia wieksza o 5: "+Arrays.toString(kopiaLiczbWiększaO5));
			kopiaLiczbWiększaO5[7]=5;
			System.out.println("Przypisanie wartosci kopii w indexie nr 7:"+Arrays.toString(kopiaLiczbWiększaO5));
			System.out.println("Zmniejszenie tablicy");
			int[]malaKopia=Arrays.copyOf(kopiaLiczbWiększaO5, 4);
			System.out.println(Arrays.toString(malaKopia));
			
			System.out.println("Wypelnianie tablicy:");
			Arrays.fill(table, 1);
			System.out.println(Arrays.toString(table));
			
			String[]imiona = {"Ola", "Ala","Basia","Kasia","Zbyszek","Sebastian"};
			Arrays.sort(imiona);
			System.out.println(Arrays.toString(imiona));
			System.out.println("Indeks imienia Ola: "+Arrays.binarySearch(imiona, "Ola"));
			
			int[]tab=new int[5];
			for(int i=0;i<tab.length;i++) {
				tab[i]=i+1;
			}
			System.out.println("tab:"+Arrays.toString(tab));
			for(int i=0;i<50;i++) {
				int[]tmp=new int[tab.length+1];
			System.out.println("tmp: "+ Arrays.toString(tmp));
			System.arraycopy(tab, 0, tmp, 0, tab.length);
			System.out.println("tmp: "+Arrays.toString(tmp));
			for(i=tab.length;i<tmp.length;i++) {
				tmp[i]=i+1;
			}
			tab=tmp;
			System.out.println("tmp: "+Arrays.toString(tmp));
			System.out.println("tab: "+Arrays.toString(tab));
			
			}
		

	}

}
