package gaming;

import java.util.Arrays;

public class Scores {

	public static final int maxEntries = 10;
	protected int numEntries;
	protected GameEntry[] entries;

	public Scores() {
		numEntries = 0;
		entries = new GameEntry[maxEntries];
	}

	@Override
	public String toString() {
		return "Scores [numEntries=" + numEntries + ", entries="
				+ Arrays.toString(entries) + "]";
	}

	// add a new entry

	public void add(GameEntry e) {
		int newScore = e.getScore();
		// to check if this score can find a place in the array
		if (numEntries == maxEntries) {
			if (newScore <= entries[numEntries - 1].getScore()) {
				return;
			}
		} else {
			// need to find where to add this new entry
			numEntries++;
		}
		int i = numEntries - 1;
		for (; (i >= 1) && (newScore > entries[i - 1].getScore()); i--) {
			entries[i] = entries[i - 1];
		}
		entries[i] = e;
		
	}

	public GameEntry remove(int i) {
		if (i <= 0 || i >= numEntries) {
			throw new IndexOutOfBoundsException("Invalid Index i " + i);
		}
		GameEntry temp = entries[i];
		for (int j = i; j < numEntries - 1; j++) {
			entries[j] = entries[j + 1];
		}
		entries[numEntries - 1] = null;
		numEntries--;
		return temp;
	}

}
