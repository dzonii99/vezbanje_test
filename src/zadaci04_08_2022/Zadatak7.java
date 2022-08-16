package zadaci04_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
//		Napisati program koji simulira ponasanje kontrole 
//		za zvuk na jutjubu.. Kada se ucita video difoltna jacina 
//		zvuka je 75.
//		Korisnik unosi akciju sa tastature. Jednu od sledecih:
//		pojacaj - pojacava zvuka za 10
//		smanji - smanjuje zvuk za 10.
//		mute - postavlja zvuk na 0.
//		Na kraju programa odstampati jacinu zvuka
//		Primer izvrsenja 1:
//		Jacina zvuka je 75.
//		Unesite akciju: pojacaj
//		Nova jacina zvuka je 85

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite akciju: ");
		String akcija = s.next();
		int zvuk = 75;
		if (akcija.equals("pojacaj") || akcija.equals("Pojacaj")) {
			zvuk += 10;
		} else if (akcija.equals("smanji") || akcija.equals("Smanji")) {
			zvuk -= 10;
		} else if (akcija.equals("Mute") || akcija.equals("mute")) {
			zvuk = 0;
		} else {
			System.out.println("Uneli ste pogresnu komandu");
		}
		System.out.println("Trenutni zvuk je: " + zvuk);
	}

}
