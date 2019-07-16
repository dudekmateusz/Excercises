package main.java.arrays.screen;

public class ScreenUser {

	public static void main(String[] args) {
		Screen screen1 = new Screen(5,5);
		screen1.draw(1, 1);
		screen1.draw(2, 2);
		screen1.draw(screen1, 4, 3, 'X');
		
		screen1.printScreen();
		ScreenDrawTree screen2 = new ScreenDrawTree();
//musisz stworzy� metod� kt�ra wy�wietla ekran i odwo�a� si� do tej metody
	}

}
