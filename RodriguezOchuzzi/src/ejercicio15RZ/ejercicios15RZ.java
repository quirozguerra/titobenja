package ejercicio15RZ;

import java.util.Scanner;

public class ejercicios15RZ {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		System.out.println("ingrese la cantidad de paga brrrr");
		double pasalabirra = datos.nextDouble();
		double xd;
		double porsentaje;
		int barra_papu;
		
		if ( pasalabirra >= 15000 ){
			
			porsentaje =(pasalabirra/100)*10;
			xd = ( pasalabirra - porsentaje );
			barra_papu = (int)xd;
			
			System.out.println("tu cantidad de paga: " + barra_papu );
			
		}
		else {
			
			barra_papu = (int)pasalabirra;
			System.out.println("tu cantidad de paga es de: " + pasalabirra );
		}

	}

}
