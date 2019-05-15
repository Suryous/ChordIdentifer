
public class Note {
	
	private String name = "";
	private int octave;
	private int val;
	
	/**
	 * The note value indicating an A. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int A = 0;
	/**
	 * The note value indicating an A#. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int A$ = 1;
	/**
	 * The note value indicating a Bb. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int Bb = 1;
	/**
	 * The note value indicating a B. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int B = 2;
	/**
	 * The note value indicating an Cb. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int Cb = 2;
	/**
	 * The note value indicating a B#. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int B$ = 3;
	/**
	 * The note value indicating a C. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int C = 3;
	/**
	 * The note value indicating a C#. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int C$ = 4;
	/**
	 * The note value indicating a Db. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int Db = 4;
	/**
	 * The note value indicating a D. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int D = 5;
	/**
	 * The note value indicating a D#. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int D$ = 6;
	/**
	 * The note value indicating an Eb. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int Eb = 6;
	/**
	 * The note value indicating an E. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int E = 7;
	/**
	 * The note value indicating an Fb. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int Fb = 7;
	/**
	 * The note value indicating an E#. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int E$ = 8;
	/**
	 * The note value indicating an F. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int F = 8;
	/**
	 * The note value indicating an F#. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int F$ = 9;
	/**
	 * The note value indicating a Gb. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int Gb = 9;
	/**
	 * The note value indicating a G. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int G = 10;
	/**
	 * The note value indicating a G#. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int G$ = 11;
	/**
	 * The note value indicating an Ab. The value is determined by the number of half-steps that the note is up from A.
	 */
	public static final int Ab = 11;
	
	
	/**
	 * The value representing a double-sharp accidental. The value is determined by how the accidental modifies the letter note value.
	 */
	public static final int DOUBLE_SHARP = 2;
	/**
	 * The value representing a sharp accidental. The value is determined by how the accidental modifies the letter note value.
	 */
	public static final int SHARP = 1;
	/**
	 * The value representing a flat accidental. The value is determined by how the accidental modifies the letter note value.
	 */
	public static final int FLAT = -1;
	/**
	 * The value representing a double-flat accidental. The value is determined by how the accidental modifies the letter note value.
	 */
	public static final int DOUBLE_FLAT = -2;
	 
	/**
	 * Creates a note with a natural accidental.
	 * @param letter The letter name of the note.
	 */
	public Note(String letter, int octave) {
		name += letter.toUpperCase();
		if (letter.equalsIgnoreCase("A")) {
			val = A;
		}
		else if (letter.equalsIgnoreCase("B")) {
			val = B;
		}
		else if (letter.equalsIgnoreCase("C")) {
			val = C;
		}
		else if (letter.equalsIgnoreCase("D")) {
			val = D;
		}
		else if (letter.equalsIgnoreCase("E")) {
			val = E;
		}
		else if (letter.equalsIgnoreCase("F")) {
			val = F;
		}
		else if (letter.equalsIgnoreCase("G")) {
			val = G;
		}
		this.octave = octave;
	}
	
	/**
	 * Creates a note.
	 * @param letter The letter name of the note.
	 * @param a The accidental of the note.
	 */
	public Note(String letter, int a, int octave) {
		name += letter.toUpperCase();
		val = getValFromLetter(letter) + a;
		
		if (a == 2) {
			name += "##";
		}
		else if (a == 1) {
			name += "#";
		}
		else if (a == -1) {
			name += "b";
		}
		else if (a == -2) {
			name += "bb";
		}
		this.octave = octave;
	}
	
	/**
	 * 
	 * @param letter The letter name to be used.
	 * @return The half-step note value of a natural note with the given letter name.
	 */
	public int getValFromLetter(String letter) {
		if (letter.equalsIgnoreCase("A")) {
			return A;
		}
		else if (letter.equalsIgnoreCase("B")) {
			return B;
		}
		else if (letter.equalsIgnoreCase("C")) {
			return C;
		}
		else if (letter.equalsIgnoreCase("D")) {
			return D;
		}
		else if (letter.equalsIgnoreCase("E")) {
			return E;
		}
		else if (letter.equalsIgnoreCase("F")) {
			return F;
		}
		else if (letter.equalsIgnoreCase("G")) {
			return G;
		}
		else {
			return -1;
		}
		
	}
	
	/**
	 * @return The note name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return The note letter name as a String
	 */
	public String getStringLetter() {
		return name.substring(0,1);
	}
	
	/**
	 * 
	 * @return The note letter name as a character
	 */
	public char getCharLetter() {
		return name.charAt(0);
	}
	
	/**
	 * 
	 * @return The number of half-steps that the note is up from A
	 */
	public int getValue() {
		return val;
	}
	
	/**
	 * 
	 * @param other The other note to be compared
	 * @return The interval between this note and other
	 */
	public Interval getInterval(Note other) {
		return new Interval(this, other);
	}
	
	public int getOctave() {
		return octave;
	}
	
	public String toString() {
		return name + " " + octave;
	}
}
