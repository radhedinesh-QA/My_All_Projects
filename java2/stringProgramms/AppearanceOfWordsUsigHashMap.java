package stringProgramms;
import java.util.HashMap;
import java.util.Map;

public class AppearanceOfWordsUsigHashMap {
	public static void main(String[] args) {

		String[] str = {"dinesh", "chigari", "java", "java", "dinesh"};

		// Create HashMap
		HashMap<String, Integer> hs = new HashMap<>();

		// Count frequency
		for (String word : str) {
			if (hs.containsKey(word)) {
				hs.put(word, hs.get(word) + 1);
			} else {
				hs.put(word, 1);
			}
		}

		// Print appearance of each word
		System.out.println("Word Appearance:");
		for (Map.Entry<String, Integer> entry : hs.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
