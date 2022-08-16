package guia1;

import java.util.Scanner;

public class Universidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Universidad edificio;
	edificio = new Universidad ();
	
	//cada piso tiene 20 salones 
	//en cada salon hay 40 estudiantes
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println ("Ingrese el numero de estudiantes que pertenecen a la universidad ");
	int a;
	a = sc.nextInt();
	System.out.println ("Ingrese el numero de estudiantes en cada salon ");
	int m;
	m = sc.nextInt();
	System.out.println ("Ingrese el numero de salones en cada piso ");
	int n;
	n = sc.nextInt();
	
	
	int y;
	y = edificio.salones(a, m);
	int x;
	x = edificio.piso(y, n);
    
	
	int b  = (int)Math.round(y);
	int c  = (int)Math.round(x);
	
	System.out.println("se necesitan " + b + " salones");
	System.out.println("entonces se necesitan " + c + " pisos");
	
	
	sc.close();
	
	}

	public int salones (int a, int m) {
		int y;
		y = a/m;
		return y;
	}
	public int piso (int y, int n) {
		int z;
		z = y/n;
		return z;
	}
	
	
}
