package no.hvl.dat100;

public class Oppgave6Lab5 {

	public static void main(String[] args) {
		System.out.println("a) Skrive ut en tabell med heltall.");
		int[] tabell = {42, 67, 89};
		skrivUt(tabell);
		
		System.out.println("\nb) Returnere tabell som string.");
		System.out.println(tilStreng(tabell));
		
		System.out.println("\nc) Summer tabell av heltall.");
		System.out.println(summer1(tabell));
		System.out.println(summer2(tabell));
		System.out.println(summer3(tabell));
		
		System.out.println("\nd) Sjekke om et tall finnes i tabellen.");
		System.out.println(finnesTall(tabell, 4));
		
		System.out.println("\ne) Returner første index som inneholder tallet tall. (-1 om det ikke inneholder tallet.)");
		System.out.println(posisjonTall(tabell, 3));
		
		System.out.println("\nf) Returnerer en tabell med de samme elementene i motsatt rekkefølge.");
		System.out.println(tilStreng(reverser(tabell)));
		
		System.out.println("\ng) Sjekke om en tabell av heltall er sortert stigende.");
		System.out.println(erSortert(tabell));
		
		System.out.println("\nh) Sett sammen to tabeller i en.");
		int[] andreTabell = {90, 501, 1034};
		System.out.println(tilStreng(settSammen(tabell, andreTabell)));
	}
	
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}
	
	public static String tilStreng (int[] tabell) {
		String s = "[";
		for (int i = 0; i < tabell.length; i++) {
			s += tabell[i] + ",";
		}
		s = s.substring(0, s.length() - 1) + "]";
		
		return s;
	}
	
	public static int summer1 (int[] tabell) {
		// Regular for-loop
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) sum += tabell[i];
		
		return sum;
	}
	
	public static int summer2 (int[] tabell) {
		// While loop
		int sum = 0;
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
	}
	
	public static int summer3 (int[] tabell) {
		// Extended for-loop
		int sum = 0;
		for (int i : tabell) sum += i;
		
		return sum;
	}
	
	public static boolean finnesTall (int[] tabell, int tall) {
		for (int i : tabell) {
			if (i == tall) return true;
		}
		
		return false;
	}
	
	public static int posisjonTall (int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) return i;
		}
		return -1;
	}
	
	public static int[] reverser (int[] tabell) {
		int[] a = new int[tabell.length];
		for(int i = 0; i < a.length; i++) {
			a[i] = tabell[a.length - i - 1];
		}
		
		return a;
	}
	
	public static boolean erSortert (int[] tabell) {
		int last = 0;
		for(int i : tabell) {
			if (i < last) return false;
		}
		
		return true;
	}
	
	public static int[] settSammen (int[] tabell1, int[] tabell2) {
		int[] a = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < a.length; i++) {
			if(i < tabell1.length) {
				a[i] = tabell1[i];
			} else {
				a[i] = tabell2[i - tabell1.length];
			}
		}
		
		return a;
	}
}