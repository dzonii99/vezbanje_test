package zadaci04_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
//		Napisati program za potrebe Makao igrice. 
//		Korisnik unosi 4 informacije:
//			znak karte koja je na stolu
//			broj karte koja je na stolu
//			znak karte koju igrac zeli da odigra
//			broj karte koju igrac zeli da odigra
//			i nakon toga se na ekranu ispisuje da li je potez ispravan. 
//		Potez je ispravan ukoliko se karta na stolu i odigrana karta 
//		poklapaju po znaku ili broju.
//
//				Znakovi karata: srce, kocka, list, detelina
//				Brojevi karata: 2,3,4,5,6,7,8,9,10,A,J,Q,K
//				Primer izvrsenja 1:
//				Znak karte na stolu: srce
//				Broj karte na stolu: A
//				Znak karte koju zelis da odigras: detelina
//				Broja karte koju zelis da odigras: A
//				Potez je validan.
//
//				Primer izvrsenja 2:
//			Znak karte na stolu: srce
//				Broj karte na stolu: A
//				Znak karte koju zelis da odigras: srce
//				Broja karte koju zelis da odigras: K
//				Potez je validan.
//
//			Primer izvrsenja 3:
//			Znak karte na stolu: srce
//				Broj karte na stolu: A
//				Znak karte koju zelis da odigras: detelina
//				Broja karte koju zelis da odigras: K
//				Potez nije validan.

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite znak karte: ");
		String znakSt = s.next();
		System.out.print("Unesite broj karte na stolu: ");
		String brSto = s.next();
		System.out.print("Unesite znak koji zelite da odigrate: ");
		String znakRuka = s.next();
		System.out.print("Unesite broj koji zelite da odigrate: ");
		String brRuka = s.next();
		if (brSto.equals(brRuka) || znakSt.equals(znakRuka)) {
			System.out.println("Potez je validan");
		} else {
			System.out.println("Potez nije validan");
		}
	}

}
