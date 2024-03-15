package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {

	public static String encrypt(String text) {
		StringBuilder evenChars = new StringBuilder();
		StringBuilder oddChars = new StringBuilder();
		// Loop through the text, character by character.
		for (int i = 0; i < text.length(); i++) {
			if (i % 2 == 0) {
				// Even-indexed characters (considering 0 as the first index)
				evenChars.append(text.charAt(i));
			} else {
				// Odd-indexed characters
				oddChars.append(text.charAt(i));
			}
		}
		
		// Combine even-indexed and odd-indexed characters.
		return evenChars.toString() + oddChars.toString();
	}

}
