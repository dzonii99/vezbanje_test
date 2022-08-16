package zadaci04_08_2022;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
//	Napisati program koji u zavisnosti od operatora koji unosi 
//	korisnik sa tastature 
//	(operator je string i moze imati vrednosti +, - , *, /) racuna 
//	i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili 
//	kolicnik za dva broja a i b uneta sa tastature.
//	Primer 1:                                              Primer 2:
//	Unestite a: 6                                        Unestite a: 6
//	Unesite b: 3                                         Unesite b: 3
//	Unesite operator: +                             Unesite operator: /
//	Rezultat: 9                                           Rezultat: 2
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite A: ");
		int a = s.nextInt();
		System.out.print("Unesite B: ");
		int b = s.nextInt();
		int c = 0;
		System.out.print("Unesite operaciju: ");
		String operator = s.next();
		if (operator.equals("+")) {
			c = a + b;
			System.out.println("Zbir je " + a + " + " + b + " = " + c);
		} else if (operator.equals("-")) {
			c = a - b;
			System.out.println("Razlika je " + a + " - " + b + " = " + c);
		} else if (operator.equals("*")) {
			c = a * b;
			System.out.println("Proizvod je " + a + " * " + b + " = " + c);
		} else if (operator.equals("/") && b != 0) {
			double d = a / b;
			System.out.println("Kolicnik je " + a + " / " + b + " = " + d);
		} else {
			System.out.println("Uneli ste ili pogresan operator ili za b da je 0");
		}

	}

}
