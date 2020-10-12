/* File CharacterRemoval.java
 * --------------------------
 * This program removes a set character from a printed line.
 */

import acm.program.ConsoleProgram;

public class CharacterRemoval extends ConsoleProgram{
	
	public void run() {
		
		String strA = "This is a test";			//initial "values" of strings
		String strB = "Summer is here!";
		String strC = "---0---";
		
		println(removeAllOccurrences(strA, 't'));		//method call and specifying removal
		println(removeAllOccurrences(strB, 'e'));
		println(removeAllOccurrences(strC, '-'));
	}
	
	private String removeAllOccurrences (String str, char ch) {
		String newString = " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				newString += str.charAt(i);
			}
		}
		
		return newString;
		
	}

}
