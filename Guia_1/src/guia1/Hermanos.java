package guia1;

import java.util.Scanner;

public class Hermanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner (System.in);
			System.out.println ("Ingrese el nombre del primer hermano ");
			String a;
			a = sc.next();
			System.out.println ("Ingrese la edad del primer hermano ");
			int b;
			b = sc.nextInt();
			System.out.println ("Ingrese el nombre del segundo hermano ");
			String c;
			c = sc.next();
			System.out.println ("Ingrese la edad del segundo hermano ");
			int d;
			d = sc.nextInt();
			System.out.println ("Ingrese el nombre del tecer hermano ");
			String e;
			e = sc.next();
			System.out.println ("Ingrese la edad del tercer hermano ");
			int f;
			f = sc.nextInt();
			
			if (b > d) {
				if (b > f) {
					System.out.println(a + " es el hermano mayor");
				} else {
					System.out.println(e + " es el hermano mayor");
				} 
			}else if (d > f) {
				System.out.println(c + " es el hermano mayor");
				} else {
					System.out.println(e + " Es el hermano mayor");
			}
		
			sc.close();
		
		
	}

}
