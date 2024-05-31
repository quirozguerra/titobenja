package titobenja16;

import java.util.Scanner;

public class titobenja16 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int dia, hora, minuto, segundo;
		
		System.out.println("usted tiene que ingresar un horario valido \ningrese un dia:");
		dia = datos.nextInt();
		System.out.println("\ningrese una hora:");
		hora = datos.nextInt();
		System.out.println("\ningrese un minuto:");
		minuto = datos.nextInt();
		System.out.println("\ningrese un segundo:");
		segundo = datos.nextInt();
		
		if (dia  >= 0 && hora <= 24 && hora >= 0 && minuto >= 0 && minuto <= 60 && segundo >= 0 && segundo <= 60 ){
			System.out.println("es una fecha valida");
		}
		else {
			System.out.println("tal fecha no es valida brrr");
		}
	}

}

