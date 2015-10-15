package lab1c;

public class PatternMaker {
	public static void drawOneLine(char symbol, int noOfTimes, int offset) {
		
		System.out.println(); //new line
		
		//print out offset number of blankspaces
		for (int i = 0; i < offset; i++) {
			System.out.print(" ");
		}
		
		//print out noOfTimes number of symbols
		for(int j = 0; j < noOfTimes; j++) {
			System.out.print(String.valueOf(symbol));
		}	
		
	}
	
	public static void drawPattern() {
		for (int i = 1; i <= 3; i++) {
			drawOneLine('*', i*5, i*5);
		}
	}
	
	//since the methods are static we are able to call them without instantiating the class
	public static void main(String[] args) {
		PatternMaker.drawOneLine('+', 12, 6);
		PatternMaker.drawPattern();
	}
	
	
}
