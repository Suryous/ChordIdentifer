
public class Note {
	
	private String name;
	private int octave;
	private int val;
	
	public static final int A = 0;
	public static final int A$ = 1;
	public static final int Bb = 1;
	public static final int B = 2;
	public static final int Cb = 2;
	public static final int B$ = 3;
	public static final int C = 3;
	public static final int C$ = 4;
	public static final int Db = 4;
	public static final int D = 5;
	public static final int D$ = 6;
	public static final int Eb = 6;
	public static final int E = 7;
	public static final int Fb = 7;
	public static final int E$ = 8;
	public static final int F = 8;
	public static final int F$ = 9;
	public static final int Gb = 9;
	public static final int G = 10;
	public static final int G$ = 11;
	public static final int Ab = 11;
	
	public static final int DOUBLE_SHARP = 2;
	public static final int SHARP = 1;
	public static final int FLAT = -1;
	public static final int DOUBLE_FLAT = -2;
	
	
	public Note(String letter) {
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
		
	}
	
	
	public Note(String letter, int a) {
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
		
	}
	
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
	
	public String getName() {
		return name;
	}
	
	public String getStringLetter() {
		return name.substring(0,1);
	}
	
	public char getCharLetter() {
		return name.charAt(0);
	}
	
	public int getValue() {
		return val;
	}
	
	public Interval getInterval(Note other) {
		
	}
	
	
	
}
