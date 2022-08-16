package guia1;

import java.util.Scanner;

public class FuncionAlgebraica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		FuncionAlgebraica funcion;
		funcion = new FuncionAlgebraica ();
		System.out.println ("Ingrese un numero que reemplazara a x ");
		int x;
		x = sc.nextInt();
		System.out.println ("Ingrese un numero que reemplazara a y " );
		int y;
		y = sc.nextInt();
		int f;
		f = funcion.resultado(x, y);
		System.out.print("El resultado de la funcion algebraica x^2+2xy+y^2 remplazando las variables por los numeros " + "es " +f);
	
	sc.close();
	}
	

 
	public int resultado (int x, int y){
		int f = 0;
		f = (((int)Math.pow(x, 2)) + ((2*x)+y) + ((int)Math.pow(y, 2)));
		return f;
}
	
	}
