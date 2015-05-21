/*
 * File: RepalceChar.java
 * Name: 
 * Section Leader: 
 * --------------------
  The method willremoves all occurrences of the given
   character from the given string.
 *  
 * Author:Chao Liu
 * Contact: liuchao200240@gmail.com
 * 
 * Total grade: 
 * How to grade:
 * 1. Must run correct (60%): 60
 * 2. Proper Comments: file comment and function comment (10%): 10
 * 3. Follow the style guideline (10%): 10
 * 4. A right "top-down" Decomposition (20%): 10 
 */

import acm.program.*;

public class ReplaceChar extends ConsoleProgram {
	public void run() {
		while (true) {
			String originString = readLine("Enter a string: ");
			String ch = readLine("Enter a chracter you want to remove: ");
			String modifiedString = removeAllOccurrences(originString, ch);
			println(modifiedString);
		}
	}
	
/**
 * The method willremoves all occurrences of the given
   character from the given string.
 */
	private String removeAllOccurrences(String originString, String ch) {
		if (ch.length() != 1) {
			return "Please enter a singal char";
		} else {
			String modifiedString = originString.replaceAll(ch, "");
			return modifiedString;
		}
	}
}