package zadaci04_08_2022;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
//		Napisati program koji ispisuje za uneti broj a da li 
//		je deljiv sa 2 i deljiv sa 3.
//		Upoznajte se sa opertorom moduo % dok ne dodjemo do tog 
//		operatora.

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj: ");
		int n = s.nextInt();

		if (n % 2 == 0 && n % 3 == 0) {
			System.out.println("Broj je deljiv sa 2 i sa 3");
		} else if (n % 2 == 0) {
			System.out.println("Broj je deljiv sa 2");
		} else if (n % 3 == 0) {
			System.out.println("Broj je deljiv sa 3");
		}

	}

}
