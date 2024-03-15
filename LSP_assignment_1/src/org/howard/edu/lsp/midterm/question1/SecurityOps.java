package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {

	public static String encrypt(String text) {
		StringBuilder evenChars = new StringBuilder();
		StringBuilder oddChars = new StringBuilder();
		
		for (int i = 0; i < text.length(); i++) {
			if (i % 2 == 0) {
				evenChars.append(text.charAt(i));
			} else {
				oddChars.append(text.charAt(i));
			}
		}
		
		return evenChars.toString() + oddChars.toString();
	}

}
