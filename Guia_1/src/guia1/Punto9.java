package guia1;

import java.util.Scanner;

public class Punto9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Punto9 mayor; 
		mayor = new Punto9 ();
		int x;
			
		Scanner sc = new Scanner (System.in);
		//x = mayor.numero1(a, b);
		System.out.println ("introduce un numero: ");
		int a;
		a=sc.nextInt();
		System.out.println ("introduce otro numero: ");
		int b;
		b=sc.nextInt();
		x = mayor.numero1(a, b);
		System.out.println("El mayor de los dos numeros es " + x);
		sc.close();
		
				
	}
	public int numero1 (int a, int b) {
		int x;
		x = Math.max(a, b);
		return x;
	
		
}
}