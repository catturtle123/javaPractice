package collections;
import java.util.HashMap;
import java.util.Map;


public class MapRunner {
	public static void main(String[] args) {
		Map<Character, Integer> hashMap = new HashMap<>();
		String str = "This This is a. This";
		

		char[] characters = str.toCharArray();

		for (char character : characters) {
			Integer i = hashMap.get(character);
			if(i == null) {
				hashMap.put(character, 1);
			}else {
				hashMap.put(character, i + 1);
			}
		}

		System.out.println(hashMap);

		Map<String, Integer> hashMap2 = new HashMap<>();
		String str2 = "This This is a. This";

		String[] words = str.split(" ");

		for (String word : words) {
			Integer i = hashMap2.get(word);
			if (i == null) {
				hashMap2.put(word, 1);
			} else {
				hashMap2.put(word, i + 1);
			}
		}

		System.out.println(hashMap2);
	}
}
