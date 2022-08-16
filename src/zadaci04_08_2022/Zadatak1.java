package zadaci04_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati program koji ispisuje da li je broj b manji od broja a. 
//		A i B unosimo sa tastature.
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj A: ");
		int a = s.nextInt();
		System.out.print("Unesite broj B: ");
		int b = s.nextInt();

		if (b < a) {
			System.out.println("Broj B: " + b + " je manji od A: " + a);
		}
		System.out.println("Broj B: " + b + " je veci od A: " + a);
	}

}
