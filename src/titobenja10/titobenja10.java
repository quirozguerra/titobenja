package titobenja10;

import java.util.Scanner;

public class titobenja10 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		String nombre;
		String apellido;
		double numerodebingo = (Math.random()*99);
		int sin_los_puntitos_xd = (int)numerodebingo;
		int kjajskaajklaskjaslkajsa;
		
		System.out.println("ingrese su nombre: ");
		nombre = datos.next();
		System.out.println("ingrese su apellido: ");
		apellido = datos.next();
		System.out.println("ingrese un numero entre el 0 y 99: ");
		kjajskaajklaskjaslkajsa = datos.nextInt();
		
		System.out.println("tu nombre es: " + nombre);
		System.out.println("tu apellido es: " + apellido);
		
		if (kjajskaajklaskjaslkajsa == sin_los_puntitos_xd && kjajskaajklaskjaslkajsa <= 99 && kjajskaajklaskjaslkajsa >= 0) {
			
			System.out.println("GANASTE GORDITOOOOO \n LAS PROBABILIDADES ERAN DE UNA ENTRE 100 LIT");
			
		}
		else {
			
			System.out.println("GG BUEN INTENTO SUERTE PARA LA PROXIMA FRACA COMO JUNNOS");
			
		}
		
	}

}


