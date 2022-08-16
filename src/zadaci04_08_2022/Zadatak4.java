package zadaci04_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
//		Napisati program koji sa tastature ucitava sledece podatke:
//			pol osobe 
//			cena proizvoda
//			da li je proizvod neophodan (unosimo da ili ne)
//			I na kraju ispisuje informaciju da li ce se proizvod kupiti. 
//			Proizvod se kupuje ako je pol osobe zenski i proizvod je 
//			neophodan, nezavisno od cene proizvoda.
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite pol osobe: ");
		String pol = s.next();
		System.out.print("Unesite cenu prozivoda: ");
		int x = s.nextInt();
		System.out.print("Da li je proizvod neophodan: ");
		String bitan = s.next();
		if (pol.equals("Zenski") || pol.equals("zenski") && bitan.equals("da") || bitan.equals("Da")) {
			System.out.println("Prozivod je kupljen");
		} else {
			System.out.println("Proizvod nije kupljen");
		}
	}

}
