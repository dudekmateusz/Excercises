package main.java.arrays;

public class MultiDimensionArrays {

	public static void main(String[] args) {
	
		char screen[][] = initializeScreen(20,10);
		print(screen, 'X',5,5);
		printScreen(screen);
	}
	
	public static char[][] initializeScreen(int width, int height) {
		char scr[][] = new char[height][width];
		for(int y=0;y<height;y++) {
			for(int x=0;x<width;x++) {
				scr[y][x]='.';
			}
		}
		return scr;
	}
	public static void print(char[][]scr,char chr,int x, int y) {
		scr[y][x]=chr;
	}
	public static void printScreen(char[][]scr) {
		for(int y=0;y<scr.length;y++) {
			for(int x=0;x<scr[0].length;x++) {
				System.out.print(scr[y][x]);
			}
			System.out.println();
		}
	}
}
