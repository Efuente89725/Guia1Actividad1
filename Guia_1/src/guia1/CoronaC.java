package guia1;

import java.util.Scanner;

public class CoronaC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoronaC circulo;
		circulo = new CoronaC ();
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Ingrese r del circulo grande ");
		double r;
		r = sc.nextDouble();
		double x;
		x = circulo.acirculo(r);
		System.out.println ("El area del circulo grande es " + x);
		System.out.println ("Ingrese r del circulo pequeño ");
		double r2;
		r2 = sc.nextDouble();
		double y;
		y = circulo.corona(x, r2);
		System.out.println ("El area de la corona circular es " + y);
		
		sc.close();
		
		
		
	}
	public double acirculo (double r) {
	double x;
	x = ((Math.PI)*(Math.pow(r, 2)));
	return x;
	}
	public double corona (double x, double r2) {
	double y;
	y = x - (Math.PI* Math.pow(r2, 2));
	return y;
	}
	
	}



