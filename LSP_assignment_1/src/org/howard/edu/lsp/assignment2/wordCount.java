package org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class wordCount {
	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> wordCounts = new HashMap<>();
		Set<String> commonWords = new HashSet<>(Arrays.asList("the", "and", "a", "of", "to", "in", "it", "is"));
		String line;
		try (BufferedReader reader = new BufferedReader(new FileReader("words.txt"))) {
			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					word = word.toLowerCase();
					if (!word.isEmpty() && !commonWords.contains(word)) {
						wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
					}
				
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
		System.out.println(entry.getKey() + ": " + entry.getValue());
	}
	}
}
