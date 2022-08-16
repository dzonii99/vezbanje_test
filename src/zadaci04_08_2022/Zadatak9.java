package zadaci04_08_2022;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
//		Napisati program koji simulira ponasanje kontrole 
//		za zvuk na jutjubu.. Kada se ucita video difoltna jacina 
//		zvuka je 75.
//		Korisnik unosi 5 akcija. Jednu od sledecih:
//		pojacaj - pojacava zvuka za 10
//		smanji - smanjuje zvuk za 10.
//		mute - postavlja zvuk na 0.
//		Na kraju programa odstampati jacinu zvuka.
//		NAPOMENA: Jacina zvuka nikad ne moze da ode iznad 100 niti 
//		da padne ispod 0.
//
//		Primer izvrsenja: 
//		Unesite akciju: pojacaj (objasnjenj: nakon ovoga je 85)
//		Unesit akciju: pojacaj (objasnjenje: nakon ovoga je 95)
//		Unesite akciju: pojacaj (objasnjeje: nakon ovoga je 100, jer
//		ne moze da bude 105)
//		Unesit akciju: mute (ovjasnjenje: nakon ovoga je 0)
//		Unesit akciju: smanji (objasnjenje: nakon ovoga ostaje 0)
//		Jacina zvuka je 0.

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite akciju: ");
		String akcija = s.next();
		int zvuk = 75;
		if (akcija.equals("Pojacaj") || akcija.equals("pojacaj")) {
			zvuk += 10;
		} else if (akcija.equals("Smanji") || akcija.equals("smanji")) {
			zvuk -= 10;
		} else if (akcija.equals("Mute") || akcija.equals("mute")) {
			zvuk = 0;
		}
		System.out.println("Trenutan zvuk je: " + zvuk);

		System.out.print("Unesite akciju: ");
		akcija = s.next();
		if (akcija.equals("Pojacaj") || akcija.equals("pojacaj")) {
			zvuk += 10;
		} else if (akcija.equals("Smanji") || akcija.equals("smanji")) {
			zvuk -= 10;
			if (zvuk < 0) {
				zvuk = 0;
			}
		} else if (akcija.equals("Mute") || akcija.equals("mute")) {
			zvuk = 0;
		}
		System.out.println("Trenutan zvuk je: " + zvuk);

		System.out.print("Unesite akciju: ");
		akcija = s.next();
		if (akcija.equals("Pojacaj") || akcija.equals("pojacaj")) {
			zvuk += 10;
			if (zvuk > 100) {
				zvuk = 100;
			}
		} else if (akcija.equals("Smanji") || akcija.equals("smanji")) {
			zvuk -= 10;
			if (zvuk < 0) {
				zvuk = 0;
			}
		} else if (akcija.equals("Mute") || akcija.equals("mute")) {
			zvuk = 0;
		}
		System.out.println("Trenutan zvuk je: " + zvuk);

		System.out.print("Unesite akciju: ");
		akcija = s.next();
		if (akcija.equals("Pojacaj") || akcija.equals("pojacaj")) {
			zvuk += 10;
			if (zvuk > 100) {
				zvuk = 100;
			}
		} else if (akcija.equals("Smanji") || akcija.equals("smanji")) {
			zvuk -= 10;
			if (zvuk < 0) {
				zvuk = 0;
			}
		} else if (akcija.equals("Mute") || akcija.equals("mute")) {
			zvuk = 0;
		}
		System.out.println("Trenutan zvuk je: " + zvuk);

		System.out.print("Unesite akciju: ");
		akcija = s.next();
		if (akcija.equals("Pojacaj") || akcija.equals("pojacaj")) {
			zvuk += 10;
			if (zvuk > 100) {
				zvuk = 100;
			}
		} else if (akcija.equals("Smanji") || akcija.equals("smanji")) {
			zvuk -= 10;
			if (zvuk < 0) {
				zvuk = 0;
			}
		} else if (akcija.equals("Mute") || akcija.equals("mute")) {
			zvuk = 0;
		}
		System.out.println("Trenutan zvuk je: " + zvuk);

	}

}
