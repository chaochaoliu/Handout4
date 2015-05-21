/*
 * File: AddCommas.java
 * Name: 
 * Section Leader: 
 * --------------------
 * * When large numbers are written out on paper, the file will
 *  use commas to separate the digits into groups of three.
 *  
 * Total grade: 
 * How to grade:
 * 1. Must run correct (60%): 60
 * 2. Proper Comments: file comment and function comment (10%): 10
 * 3. Follow the style guideline (10%): 10
 * 4. A right "top-down" Decomposition (20%): 10
 
 */

import acm.program.*;

public class AddCommas extends ConsoleProgram {
	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric string: ");
			println(addCommasToNumericString(digits));
		}
	}

	private String addCommasToNumericString(String digits) {

		int length = digits.length();
		String result = "";

		if (length <= 3) {
			return digits;
		} else {
			/*
			 * define a reminder to decide whether the length of digits is the
			 * times of 3.
			 */
			int reminder = (length) % 3;
			/*
			 * If remainder is not 0, then return the first 1 or 2 digits, and
			 * add comma to the rest digits.
			 */
			if (reminder != 0) {
				for (int j = 0; j < reminder; j++) {
					result = result + digits.charAt(j);
				}
				for (int k = reminder; k < length - 1; k = k + 3) {
					String s = digits.substring(k, k + 3);
					result = result + "," + s;
				}
			} else {
				/*
				 * If remainder is 0, then return the first 3 digits, and add
				 * comma to the rest digits.
				 */
				for (int j = 0; j < 3; j++) {
					result = result + digits.charAt(j);
				}

				for (int k = 3; k < length - 1; k = k + 3) {
					String s = digits.substring(k, k + 3);
					result = result + "," + s;
				}
			}
		}

		return result;
	}

}
