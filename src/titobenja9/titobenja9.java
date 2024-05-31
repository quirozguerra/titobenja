package titobenja9;

import java.util.Scanner;

public class titobenja9 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		String nombre;
		String apellido;
		double numerodebingo = (Math.random()*99);
		int sin_los_puntitos_xd = (int)numerodebingo;
		
		System.out.println("ingrese su nombre: ");
		nombre = datos.next();
		System.out.println("ingrese su apellido: ");
		apellido = datos.next();
		
		System.out.println("su nombre es: " + nombre);
		System.out.println("su apellido es: " + apellido);
		System.out.println("su numero de bingo es: " + sin_los_puntitos_xd);

	}

}

