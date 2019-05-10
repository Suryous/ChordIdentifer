
public class Interval {

	private int value;
	private char quality;
	
	public static final int DIMINISHED = '°';
	public static final char MINOR = 'm';
	public static final char PERFECT = 'P';
	public static final char MAJOR = 'M';
	public static final char AUGMENTED = '+';
	
	public Interval(Note n1, Note n2) {
		value = n2.getCharLetter()-n1.getCharLetter()+1;
		int test = n2.getValue()-n1.getValue();
		if (value == 1) {
			if (test == 0) {
				quality = PERFECT;
			}
			else if (test == 1) {
				quality = AUGMENTED;
			}
		}
		else if (value == 2) {
			if (test == 0) {
				quality = DIMINISHED;
			}
			else if (test == 1) {
				quality = MINOR;
			}
			else if (test == 2) {
				quality = MAJOR;
			}
			else if (test == 3) {
				quality = AUGMENTED;
			}
		}
		else if (value == 3) {
			if (test == 2) {
				quality = DIMINISHED;
			}
			else if (test == 3) {
				quality = MINOR;
			}
			else if (test == 4) {
				quality = MAJOR;
			}
			else if (test == 5) {
				quality = AUGMENTED;
			}
		}
		else if (value == 4) {
			if (test == 4) {
				quality = DIMINISHED;
			}
			else if (test == 5) {
				quality = PERFECT;
			}
			else if (test == 6) {
				quality = AUGMENTED;
			}
		}
		else if (value == 5) {
			if (test == 6) {
				quality = DIMINISHED;
			}
			else if (test == 7) {
				quality = MINOR;
			}
			else if (test == 8) {
				quality = MAJOR;
			}
			else if (test == 3) {
				quality = AUGMENTED;
			}
		}
		else if (value == 2) {
			if (test == 0) {
				quality = DIMINISHED;
			}
			else if (test == 1) {
				quality = MINOR;
			}
			else if (test == 2) {
				quality = MAJOR;
			}
			else if (test == 3) {
				quality = AUGMENTED;
			}
		}
		else if (value == 2) {
			if (test == 0) {
				quality = DIMINISHED;
			}
			else if (test == 1) {
				quality = MINOR;
			}
			else if (test == 2) {
				quality = MAJOR;
			}
			else if (test == 3) {
				quality = AUGMENTED;
			}
		}
	}
	
}
