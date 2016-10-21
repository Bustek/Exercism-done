import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Pangrams {

	public static boolean isPangram(String string) {
		List<Character> listOfAlphabet = new LinkedList<>();
		for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			listOfAlphabet.add(alphabet);
		}
		char[] givenSentance;
		givenSentance = string.toLowerCase().toCharArray();
		for (int i = 0; i < givenSentance.length; i++) {
			if (listOfAlphabet.contains(givenSentance[i])) {
				Iterator<Character> it = listOfAlphabet.iterator();
				while (it.hasNext()) {
					if (it.next().equals(givenSentance[i])) {
						it.remove();
						break;
					}
				}
			}
		}
		return listOfAlphabet.isEmpty();
	}

}
