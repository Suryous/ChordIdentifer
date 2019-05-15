
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String args[]) {
		Scanner kboard = new Scanner(System.in);
		
		ArrayList<Note> n = new ArrayList<Note>();
		n.add(new Note("E", 4));
		n.add(new Note("G", 4));
		n.add(new Note("C", 4));
		
		Chord c = new Chord(n);
		c.identifyTriad();
		System.out.println(c.toString());
		
	}
}
