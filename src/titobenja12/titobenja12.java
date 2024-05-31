package titobenja12;

import java.util.Scanner;

public class titobenja12 {
	

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		
		int esepapumisterioso;
		String hola = "ingrese tu nota";
		
		System.out.println(hola);
		esepapumisterioso = datos.nextInt();
		
		if (esepapumisterioso >=1 && esepapumisterioso <=3){
			System.out.println("tu nota es insuficiente inutil");
		}
		else if (esepapumisterioso > 3 && esepapumisterioso < 6){
			System.out.println("tu nota es no lograda");
		}
		else if (esepapumisterioso == 6 && esepapumisterioso == 7){
			System.out.println("tu nota es suficiente");
		}
		else if(esepapumisterioso == 8 && esepapumisterioso == 9){
			System.out.println("tu nota es notable");
		}
		else if (esepapumisterioso == 10){
			System.out.println("tu nota es sobresaliente");
		}
		else {
			System.out.println("nota no valida perro");
		}
		
	}

}


