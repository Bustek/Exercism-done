import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;

public class DNA {

	public char[] dnaChain;
	public int counter = 0;
	public char[] validNucleotides = new char[] { 'A', 'C', 'G', 'T' };

	public DNA(String dnaChain) {
		this.dnaChain = dnaChain.toCharArray();
	}

	public Map<Character, Integer> nucleotideCounts() {
		final Map<Character, Integer> nucleotideCounter = new HashMap<Character, Integer>();
		for (char nucleotide : validNucleotides) {
			nucleotideCounter.put(nucleotide, 0);
		}
		for (int i = 0; i < dnaChain.length; i++) {
			nucleotideCounter.put(dnaChain[i], nucleotideCounter.get(dnaChain[i]) + 1);
		}
		return nucleotideCounter;
	}
	
	public int count(char c) {
		counter = 0;
		boolean flag = false;
		for (char nucl : validNucleotides) {
			if (nucl == c) {
				flag = true;
			}
		}
		if (!flag) {
			throw new IllegalArgumentException();
		}
		for (char nucleotide : dnaChain) {
			if (nucleotide == c) {
				counter++;
			}
		}
		return counter;
	}
}
