package main.java.endlessScreen;

public class EndlessScreen {

	public static void main(String[] args) {
		
		Endless endless = new Endless();
		while(true) {
		endless.PrintTab(endless);
		endless.append(10);
		endless.PrintTab(endless);
		endless.append(5);
		endless.PrintTab(endless);
		endless.append(5, 1);
		endless.PrintTab(endless);
		System.out.println(endless.get(0));
		}

	}

}
