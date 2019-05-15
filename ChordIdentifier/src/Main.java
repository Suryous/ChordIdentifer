
import java.util.Scanner;

public class Main {

	public static void main (String args[]) {
		Scanner kboard = new Scanner(System.in);
		System.out.println("Enter the note 1 letter:");
		String letter1 = kboard.nextLine();
		System.out.println("Enter the note 1 accidental (type bb for double flat, b for flat, # for sharp, and ## for double sharp. Leave blank for natural");
		String test1 = kboard.nextLine();
		int a1 = 0;
		if (test1.equals("bb")) {
			a1 = Note.DOUBLE_FLAT;
		}
		else if (test1.equals("b")) {
			a1 = Note.FLAT;
		}
		if (test1.equals("#")) {
			a1 = Note.SHARP;
		}
		if (test1.equals("##")) {
			a1 = Note.DOUBLE_SHARP;
		}
		
		Note n1 = new Note(letter1, a1);
		
		System.out.println("Enter the note 2 letter:");
		String letter2 = kboard.nextLine();
		System.out.println("Enter the note 2 accidental (type bb for double flat, b for flat, # for sharp, and ## for double sharp. Leave blank for natural");
		String test2 = kboard.nextLine();
		int a2 = 0;
		if (test2.equals("bb")) {
			a2 = Note.DOUBLE_FLAT;
		}
		else if (test2.equals("b")) {
			a2 = Note.FLAT;
		}
		if (test2.equals("#")) {
			a2 = Note.SHARP;
		}
		if (test2.equals("##")) {
			a2 = Note.DOUBLE_SHARP;
		}
		
		Note n2 = new Note(letter2, a2);
		
		Interval i = new Interval(n1, n2);
		
		System.out.println("Note 1: " + n1.getName() + "\nNote 2: " + n2.getName() + "\nInterval: " + i.toString());
		
	}
}
