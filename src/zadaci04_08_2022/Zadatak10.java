package zadaci04_08_2022;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
//		Napisati program koji za ucitava brojeve a i b 
//		(b ima vrednosti 1 ili 2) Ukoliko se za b unese:
//			b=1, vrednost promenljive a se uvecava za 10
//			b=2, vrednost promenljive a se smanjuje za 20
//			Na kraju zadatka odstampati novu vrednost promenljive a.
//				Primer izvrsenja:
//				Unesite a: 44
//				Unesite b: 2
//				Nova vrednost za a je 24

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj a: ");
		int a = s.nextInt();
		System.out.print("Unesite broj b: ");
		int b = s.nextInt();
		if (b == 1) {
			a += 10;
		} else if (b == 2) {
			a -= 20;
		} else {
			System.out.println("Uneli ste pogresan broj za b");
		}
		System.out.println("Vas broj je: " + a);

	}

}
