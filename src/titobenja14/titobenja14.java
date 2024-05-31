package titobenja14;

import java.util.Scanner;

public class titobenja14 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		double sigmabro ;
		int nm1 = 1 ;
		double nm2 = (1 - 2) ;
		
		System.out.println("ingresa un numero que se pueda dividir");
		sigmabro = datos.nextInt();
		
		if (sigmabro < nm1 && sigmabro > nm2){
			System.out.println("tu numero no se puede dividir");
		}
		else {
			System.out.println("tu numero si se puede dividir");
		}
	}
	
}

