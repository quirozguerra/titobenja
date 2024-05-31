package ejercicio19RZ;

import java.util.Scanner;

public class ejercicio19RZ {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int benja_bebe;
		
		System.out.println("ingrese el cafe que desea:\n\n1. Cafe Cortado\n2. Cafe Latte\n3. Cafe Solo \n4. Cafe Lagrima\n5. salir del programa");
		benja_bebe = datos.nextInt();
		
		switch (benja_bebe) {
		
		case 1:
			System.out.println("elegiste el Cafe Cortado");
			break;
		case 2:
			System.out.println("elegiste el Cafe Latte");
			break;
		case 3:
			System.out.println("elegiste el Cafe Solo");
			break;
		case 4:
			System.out.println("elegiste el Cafe Lagrima");
			break;
		case 5:
			System.out.println("saliste de programa");
			break;
		default:
			System.err.println("NUMERO NO VALIDO");
			
		}
	}

}
