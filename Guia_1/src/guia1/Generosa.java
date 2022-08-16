package guia1;

import java.util.Scanner;

public class Generosa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Generosa aumento;
	aumento = new Generosa (); 
		
		

		int y;
		y = 800000;
		int z;
		z = 1200000;
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Ingrese su salario ");
		int a;
		a = sc.nextInt();
		
		
		if(a ==y || a <y) {
			System.out.println("Su aumento sera de 10% siendo " + aumento.opcion1(a, y));
		}
		else if (a>y || a <z) {
			System.out.println("Su aumento sera de 8% siendo " + aumento.opcion2(a, z));
		}
		else if (a>z) {
			System.out.println("su aumento sera de 5% siendo " +  aumento.opcion3(a, z));
			}
		sc.close();
	}
	
	
	
		public int opcion1 (int a, int y) {
			int m;
			m = (a + (((a*10)/100)));
			return m;
	}
		public int opcion2 (int a, int z) {
			int n;
			n = (a + (((a*8)/100)));
			return n;
	}

		public int opcion3 (int a, int z) {
			int o;
			o = (a + (((a*5)/100)));
			return o;
		}
}

	

