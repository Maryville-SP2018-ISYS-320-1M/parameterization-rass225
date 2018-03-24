/*
	ISYS 320
	Name(s):
	Date: 
*/


public class P7_FixThis {

	public static void main(String[] args) {
		for( int line = 0; line < 10; line++ ) {
			int starsToWrite = line % 5 + 1 ;
			writeChar( '*', starsToWrite );
			System.out.println();
		}
		
	    }
	
	public static void writeChar( char characterToPrint, int numOfTimesToPrint  ) {
		for( int numOfTimesPrinted = 1; numOfTimesPrinted <= numOfTimesToPrint; numOfTimesPrinted++ ) {
			System.out.print( characterToPrint );
		}
	}
}
