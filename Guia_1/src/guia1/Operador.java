package guia1;

import java.util.Scanner;

public class Operador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operador v;
		v = new Operador ();
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Ingrese un operador aritmetico por ejemplo +, -, /, * ");
		String a;
		a = sc.next();
		System.out.println ("introduce un numero: ");
		int b;
		b=sc.nextInt();
		System.out.println ("introduce otro numero: ");
		int c;
		c=sc.nextInt();
		sc.close();	
			
		int x;
		x = v.suma (b, c);
		int y;
		y = v.resta(b, c);
		int z;
		z = v.division(b, c);
		int m;
		m = v.multiplicacion(b, c);
		
		
		switch (a) {
			case "+":
				System.out.println("Esto es una suma");
				System.out.println("resultado " + x);
				break;
			case "-":
				System.out.println("Esto es una resta");
				System.out.println("resultado " + y);
				break;
			case "/":
				System.out.println("Esto es una division");
				System.out.println("resultado " + z);
				break;
			case "*":
				System.out.println("Esto es una multiplicacion");
				System.out.println("resultado " + m);
				break;
		}
	}

		public int suma(int b, int c){
			int x;
			x = b + c;
			return x;
		}
		
		public int resta(int b, int c){
			int y;
			y = b - c;
			return y;
		}
		public int division(int b, int c){
			int z;
			z = b / c;
			return z;	
		}
		
		public int multiplicacion(int b, int c){
			int m;
			m = b / c;
			return m;	
		}
	}
