package zadaci04_08_2022;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati program koji ucitava broj a i ispisuje poruke:
//			Ukoliko je broj a do 10 stampamo da je jednocifren broj
//			Ukoliko je broj a do 100 stampamo da je dvocifren broj
//			Ukoliko je broj a veci od 100 stampamo da je trocifren.

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj A: ");
		int a = s.nextInt();

		if (a < 0) {
			System.out.println("Uneli ste pogresnu cifru");
		} else if (a < 10) {
			System.out.println("Vas broj A: " + a + " je jednocifreni");
		} else if (a < 100) {
			System.out.println("Vas broj A: " + a + " je dvocifreni");
		} else if (a <= 999) {
			System.out.println("Vas broj A: " + a + " je trocifreni");
		} else if (a > 999) {
			System.out.println("Vas broj A: " + a + " je visecifreni");
		}

	}
}
