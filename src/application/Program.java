package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.print("Valor de a: ");
		a = sc.nextDouble();
		System.out.print("Valor de b: ");
		b = sc.nextDouble();
		System.out.print("Valor de c: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4*a*c;
		x1 = (- b + Math.sqrt(delta))/2*a;
		x2 = (- b - Math.sqrt(delta))/2*a;

		System.out.printf("X1 = %.2f\nX2 = %.2f\n", x1,x2);
		
		sc.close();
	}

}
