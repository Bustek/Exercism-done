import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public Map<String, Integer> occurenceMap = new HashMap<>();
	public Map<String, Integer> phrase(String thePhrase) {
		String[] stringArray;
		stringArray = thePhrase.split(" ");
		for (String text : stringArray) {
			text = text.replaceAll("[^A-Za-z0-9]+", "");
			text = text.toLowerCase();
			if (!text.isEmpty()) {
				occurenceMap.put(text, occurenceMap.getOrDefault(text, 0) + 1);
			}
		}
		return occurenceMap;
	}
}