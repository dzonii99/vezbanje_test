package zadaci04_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		Napisati program koji ucitava brojeve a, b i c sa 
//		tastature i proverava da li je broj a u opsegu od b do c.
//
//		………b=0……………a=22…………………c=50…………

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite A: ");
		int a = s.nextInt();
		System.out.print("Unesite B: ");
		int b = s.nextInt();
		System.out.print("Unesite C: ");
		int c = s.nextInt();
		if (a < b || a > c) {
			System.out.println("Nije u opsegu");
		} else {
			System.out.println("U opsegu je");
		}
	}

}
