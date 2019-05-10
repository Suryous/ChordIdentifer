
public class Interval {

	private int value;
	private char quality;
	
	public static final char DIMINISHED = '°';
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
		}
	}
	
}
