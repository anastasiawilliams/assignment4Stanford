/* File Commas.java
 * ------------------
 * This program adds the convential comma into numbers larger than 999 after each third number
 */
import acm.program.ConsoleProgram;

public class Commas extends ConsoleProgram {
	
	public void run() {
		
		while(true) {
			String digits = readLine("Enter a numeric string: ");    //prompts user to enter numeric string
			println(addCommasToNumericString(digits));				// method call
		}
	}
	
	private String addCommasToNumericString(String digits) {
		int stringlen = digits.length();
		String newString = " ";
		
		int numbers = 0;
		
		for (int i = stringlen - 1; i >= 0; i--) {
			newString = digits.charAt(i) + newString;
			numbers++;
			if (((numbers % 3) == 0) && (i > 0)) {
				newString = "," + newString;
			}
		}
		
		return newString;
	}

}
