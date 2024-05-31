package ejercicio13RZ;

import java.util.Scanner;

public class ejercicio13RZ {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
	char sigmabrobenja;
	
	System.out.println("ingrese una talla");
	sigmabrobenja = datos.next().charAt(0);
	
	if (sigmabrobenja == 's'|| sigmabrobenja == 'S') {
		System.out.println("quedan 5 remeras");
	}
	else if (sigmabrobenja == 'm'|| sigmabrobenja == 'M') {
		System.out.println("quedan 2 remeras");
	}
	else if (sigmabrobenja == 'l' || sigmabrobenja == 'L') {
		System.out.println("no nos quedan mas remeras");
	}
	else {
		System.out.println("talla no valida");
	}

	}

}
