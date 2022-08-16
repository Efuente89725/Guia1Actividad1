package guia1;

import java.util.Scanner;


public class Escalera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escalera altura;
		altura = new Escalera ();
		
		double x;
		Scanner sc = new Scanner (System.in);
		System.out.println ("introduce el numero de grados: ");
		double a;
		a=sc.nextDouble();
		System.out.println ("introduce la altura: ");
		double b;
		b=sc.nextDouble();
		x = altura.longitud(a, b);
		System.out.println("la longitud de la escalera es " + (x));
		sc.close();

	}

	public double longitud(double a, double b){
	double x;
	x =(b/(Math.sin(Math.toRadians(a))));
	return x;
}
}
