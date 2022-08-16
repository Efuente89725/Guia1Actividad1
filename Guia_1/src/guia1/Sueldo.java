package guia1;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sueldo dinero;
		dinero = new Sueldo ();
		
		double x;
		double y;
		double z;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Ingrese su sueldo: ");
		double a;
		a=sc.nextDouble();
		System.out.println ("El porcentaje para el arriendo sera de 40% ");
		double b;
		b = 40;
		System.out.println ("El porcentaje para la comida sera de 15%  ");
		double c;
		c = 15;
		x = dinero.sobra(a, b, c);
		System.out.println("La cantidad de dinero que queda disponible es " + (x));
		y = dinero.arriendo(a, b);
		System.out.println("La cantidad de dinero usada para el arriendo es de " + y);
		z = dinero.comida(a, c);
		System.out.println("La cantidad de dinero usada para la comida es de " + z);
		sc.close();
		

	}

	public double sobra (double a, double b, double c) {
	double x;
	x = (a - (((a*b)/100)+((a*c)/100)));
	return x;
}
	
	public double arriendo (double a, double b) {
	double y;
	y = ((a*b)/100);
	return y;
}

	public double comida (double a, double c) {
	double z;
	z = ((a*c)/100);
	return z;
}

}
