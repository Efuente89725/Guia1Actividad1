package guia1;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Ingrese un dia de la semana ");
		String a;
		a = sc.next();
		
		sc.close();	
			
		
		switch (a) {
			case "lunes":
				System.out.println("Martes");
				break;
			case "martes":
				System.out.println("Miercoles");
				break;
			case "miercoles":
				System.out.println("Jueves");
				break;
			case "jueves":
				System.out.println("viernes");
				break;
			case "viernes":
				System.out.println("sabado");
				break;
			case "sabado":
				System.out.println("domingo");
				break;
			case "domingo":
				System.out.println("lunes");
				break;
			default:
				System.out.println("Escriba un dia de la semana en minuscula ");
				break;
				
		
			
			
		}
	}

	
	
	
	
	
}
