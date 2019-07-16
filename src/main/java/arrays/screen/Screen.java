package main.java.arrays.screen;

public class Screen {

	char screen[][];
	private int width;
	private int height;
	private char defaultSign = '.';
	private char specialSign = '^';
	
	public Screen(int width, int height) {
		this.height = height;
		this.width = width;
		this.screen = this.initializeScreen(width, height);
		
	}
	
	public char[][] initializeScreen(int width, int height) {
		char scr[][] = new char[height][width];
		return scr;
	}
	public char[][] getScreen() {
		return screen;
	}
	
	public void fillScreen() {
		for(int i=0;i<screen.length;i++) {
			for(int j=0;j<screen[i].length;j++) {
				screen[i][j]=defaultSign;
				System.out.print(screen[i][j]);
			}
			i++;
			System.out.println();
		}
		
	}
	public void draw(int x, int y) {
		this.screen[x][y] =  this.defaultSign;
	}
	public void draw(Screen screen,int x, int y,char c) {
		this.screen[x][y]=c;
	}
	public void printScreen() {
		char screen[][] = getScreen();
		for(int i=0;i<screen.length;i++) {
			for(int j=0;j<screen[i].length;j++) {
				System.out.print(screen[i][j]);
			}
			System.out.println();
		}
	}
	public void clean() {
		this.screen = null;
	}
	
	//char hearth[][]= {2,4,6,8},{1,5,7}, itd - metoda, �eby napisa� serce

}
