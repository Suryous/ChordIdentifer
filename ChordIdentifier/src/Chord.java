import java.util.ArrayList;

public class Chord {

	private ArrayList<Note> notes;
	private Note root;
	private String quality;
	private String inversion;
	private int extension;
	
	public static final boolean FIGURED_BASS = true;
	public static final boolean JAZZ = false;
	
	public Chord() {
		notes = new ArrayList<Note>();
	}
	
	public Chord(ArrayList<Note> n) {
		notes = n;
	}
	
	private ArrayList<Note> sortByLetter() {
		ArrayList<Note> sort = new ArrayList<Note>();
		for (Note n : notes) {
			sort.add(n);
		}
		
		for (int i = 0; i < sort.size(); i++) {
			for (int k = i+1; k < sort.size(); k++) {
				if (sort.get(i).getCharLetter() > sort.get(k).getCharLetter()) {
					Note temp = sort.get(i);
					sort.set(i, sort.remove(k));
					sort.add(k, temp);
				}
			}
		}
		return sort;
	}
	
	public void identifyTriad() {
		Interval bass_tenor = new Interval(notes.get(0), notes.get(1));
		if (bass_tenor.getValue() == 4) {
			root = notes.get(1);
			inversion = "64";
		}
		else {
			Interval tenor_alto = new Interval(notes.get(0), notes.get(2));
			if (tenor_alto.getValue() == 5) {
				root = notes.get(0);
				inversion = "";
			}
			else {
				root = notes.get(2);
				inversion = "6";
			}
		}
		ArrayList<Note> n = new ArrayList<Note>();
		Note third = notes.get(2 - (notes.indexOf(root) + 1) % 2);
		Note fifth = notes.get(notes.indexOf(root) + 2);
		n.add(root);
		n.add(third);
		n.add(fifth);
		if (root.getInterval(third).getQuality().equals(Interval.MAJOR)) {
			if (third.getInterval(fifth).getQuality().equals(Interval.MAJOR)) {
				this.quality = Interval.AUGMENTED;
			}
			else {
				this.quality = Interval.MAJOR;
			}
		}
		else if (root.getInterval(third).getQuality().equals(Interval.MINOR)) {
			if (third.getInterval(fifth).getQuality().equals(Interval.MAJOR)) {
				this.quality = Interval.MINOR;
			}
			else {
				this.quality = Interval.DIMINISHED;
			}
		}
	}
	
	public String toString() {
		return root.getName() + quality + inversion;
	}
}

