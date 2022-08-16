package guia1;

import java.util.Scanner;

public class Terrenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Terrenos perimetro;
	perimetro = new Terrenos ();		
	

	Scanner sc = new Scanner (System.in);
	
	System.out.println ("Ingrese la altura del terreno en metros ");
	int a;
	a = sc.nextInt();
	System.out.println ("Ingrese la base del terreno en metros ");
	int b;
	b = sc.nextInt();
	System.out.println ("Ingrese el lado c en metros ");
	int c;
	c = sc.nextInt();
	int y;
	y = perimetro.hipotenusa(a, b, c);
	System.out.println ("El area del terreno es de " + ((perimetro.rectangulo(a, b, c)+( perimetro.tri(a, b, c)))) +  (" metros ") + (" y el perimetro es de " + perimetro.peri(a, b, c, y)));
	
	sc.close();
	
		
		
	}
	
	public int rectangulo (int a, int b, int c) {
		int x;
		x = ((a-c) * b);
		return x;
	}
	 
	public int hipotenusa (int a, int b, int c) {
		int y;
		y = (int)(((Math.pow((a-c), 2))+(Math.pow(b, 2)))/2);
		return y;
	}
	
	public int tri(int a, int b, int c) {
		int z;
		z = (((b*(a-c)))/2);
		return z;
	}
	
	public int peri (int a, int b, int c, int y) {
		int m;
		m = (a+b+c+y);
		return m;
	}
}
