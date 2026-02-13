package stringProgramms;
import java.util.HashMap;
import java.util.Map;

public class AppearanceWithHashMapContinue {
	public static void main(String[] args) {

		String str = "dinesh java selenium java dinesh test";

		String[] words = str.split(" ");

		HashMap<String, Integer> map = new HashMap<>();

		for (String word : words) {

			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1){
				System.out.println(entry.getKey() + " = " + entry.getValue());}
		}

	}
}
