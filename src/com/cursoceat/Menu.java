package com.cursoceat;

import java.util.Scanner;

public class Menu {
	static public void miMenu () {
	int opcion;
	
	do {
		System.out.println("______________________________");
		System.out.println("     MENÚ CALCULADORA         ");
		System.out.println("        1.SUMAR               ");
		System.out.println("        2.RESTAR              ");
		System.out.println("        3.MULTIPLICAR         ");
		System.out.println("        4.DIVIDIR             ");
		System.out.println("        5.RESTO               ");
		System.out.println("        6.EXPONENCIAL         ");
		System.out.println("        7.SALIR               ");
		System.out.println("______________________________");
		System.out.print("Tu opcion es-> ");
		opcion=new Scanner(System.in).nextInt();
		switch (opcion){
		case 1:
		System.out.println("1.SUMAR");
		break;
		case 2:
		System.out.println(" 2.RESTAR ");
		break;
		case 3:
		System.out.println(" 3.MULTIPLICAR");
		break;
		case 4:
		System.out.println(" 4.DIVIDIR ");
		break;
		case 5: 
		System.out.println("5.RESTO");
		break;
		case 6:
		System.out.println("6.EXPONENCIAL");
		break;
		}
		
		} while (opcion!=7) ;
			System.out.println("Salir");
			
		}
}
	
	
	
	
	

