package stringProgramms;

import java.util.HashMap;
import java.util.Map;

public class GetAppearanceWithMAP {
	public static void main(String[] args) {

		String[] str = {"dinesh", "chigari", "java", "java", "dinesh"};

		HashMap<String, Integer> map = new HashMap<>();

		for (String s : str) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		System.out.println("Duplicate values:");

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
