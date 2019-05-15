
public class Interval {

	private int value;
	private String quality;
	
	
	/**
	 * The String indicating a double-diminished interval
	 */
	public static final String DOUBLE_DIMINISHED = "°°";
	/**
	 * The character indicating a diminished interval
	 */
	public static final String DIMINISHED = "°";
	/**
	 * The character indicating a minor interval
	 */
	public static final String MINOR = "min";
	/**
	 * The character indicating a perfect interval
	 */
	public static final String PERFECT = "P";
	/**
	 * The character indicating a major interval
	 */
	public static final String MAJOR = "Maj";
	/**
	 * The character indicating an augmented interval
	 *
	 */
	public static final String AUGMENTED = "+";
	/**
	 * The String indicating a double-augmented interval
	 */
	public static final String DOUBLE_AUGMENTED = "++";
	
	/**
	 * Constructs an Interval with a quality and value based on the interval between two notes.
	 * @param n1 The lower note to be compared.
	 * @param n2 The higher note to be compared.
	 */
	public Interval(Note n1, Note n2) {
		value = Math.abs(n2.getCharLetter()-n1.getCharLetter())+1;
		int n2v = n2.getValue();
		if (n1.getValue() > n2v) {
			n2v += 12;
		}
		int test = Math.abs(n2v - n1.getValue());
		if (value == 1) {
			if (test == 0) {
				quality = PERFECT;
			}
			else if (test == 1) {
				quality = AUGMENTED;
			}
			else if (test == 2) {
				quality = DOUBLE_AUGMENTED;
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
			else if (test == 4) {
				quality = DOUBLE_AUGMENTED;
			}
		}
		else if (value == 3) {
			if (test == 1) {
				quality = DOUBLE_DIMINISHED;
			}
			else if (test == 2) {
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
			else if (test == 6) {
				quality = DOUBLE_AUGMENTED;
			}
		}
		else if (value == 4) {
			if (test == 3) {
				quality = DOUBLE_DIMINISHED;
			}
			else if (test == 4) {
				quality = DIMINISHED;
			}
			else if (test == 5) {
				quality = PERFECT;
			}
			else if (test == 6) {
				quality = AUGMENTED;
			}
			else if (test == 7) {
				quality = DOUBLE_AUGMENTED;
			}
		}
		else if (value == 5) {
			if (test == 5) {
				quality = DOUBLE_DIMINISHED;
			}
			else if (test == 6) {
				quality = DIMINISHED;
			}
			else if (test == 7) {
				quality = PERFECT;
			}
			else if (test == 8) {
				quality = AUGMENTED;
			}
			else if (test == 9) {
				quality = DOUBLE_AUGMENTED;
			}
		}
		else if (value == 6) {
			if (test == 6) {
				quality = DOUBLE_DIMINISHED;
			}
			else if (test == 7) {
				quality = DIMINISHED;
			}
			else if (test == 8) {
				quality = MINOR;
			}
			else if (test == 9) {
				quality = MAJOR;
			}
			else if (test == 10) {
				quality = AUGMENTED;
			}
			else if (test == 11) {
				quality = DOUBLE_AUGMENTED;
			}
		}
		else if (value == 7) {
			if (test == 8) {
				quality = DOUBLE_DIMINISHED;
			}
			else if (test == 9) {
				quality = DIMINISHED;
			}
			else if (test == 10) {
				quality = MINOR;
			}
			else if (test == 11) {
				quality = MAJOR;
			}
			else if (test == 0) {
				quality = AUGMENTED;
			}
			else if (test == 1) {
				quality = DOUBLE_AUGMENTED;
			}
		}
	}
	
	
	public int getValue() {
		return value;
	}
	
	public String getQuality() {
		return quality;
	}
	/**
	 * @return The interval as a string
	 */
	public String toString() {
		return quality + value;
	}
	
}
