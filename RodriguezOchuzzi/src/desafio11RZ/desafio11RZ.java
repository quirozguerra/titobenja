package desafio11RZ;

import java.io.DataOutputStream;
import java.util.Scanner;

public class desafio11RZ {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int chancho;
		
		System.out.println("ingrese un numerito uwu: ");
		chancho = datos.nextInt();
		
		if (chancho == 0) {
			System.out.println("el numero que ingresaste es: " + chancho);
		}
		else if (chancho >= 1){
			System.out.println("tu numero es de un valor positivo");
		}
		else {
			System.out.println("tu numero es de valor negativo");
		}
	}
}
