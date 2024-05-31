package ejercicio18RZ;

import java.util.Scanner;

public class ejercicio18RZ {

	public static void main(String[] args) {

		Scanner datos = new Scanner (System.in);
		
		char sigmabrobenja;
		
		System.out.println("ingrese una de las siguientes tallas \n1. S \n2. M \n3. L");
		sigmabrobenja = datos.next().charAt(0);
		
		switch (sigmabrobenja) {
		
		case 1:
			System.out.println("nos quedan 5 remeras");
			break;
			
		case 2:
			System.out.println("nos quedan 2 remeras");
			break;
			
		case 3:
			System.out.println("no quedam remeras");
			break;
		default:
			System.err.println("TALLA NO VALIDA");
		}

	}
	
}