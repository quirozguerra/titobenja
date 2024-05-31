package titobenja17;

import java.util.Scanner;

public class titobenja17 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		int eso_tilin, benja, elpepe;
		
		System.out.println("ingrese el primer numero");
		eso_tilin = datos.nextInt();
		System.out.println("ingrese el segundo numero");
		benja = datos.nextInt();
		System.out.println("ingrese el tercer numero");
		elpepe = datos.nextInt();
		
		if (eso_tilin > benja && eso_tilin > elpepe) {
			if (benja > elpepe){
				System.out.println("aca esta el orden de los numero \n1 " + eso_tilin + "\n2. " + benja + "\n3. " + elpepe );
			}
		
			else {
				System.out.println("aca esta el orden de los numero \n1 " + eso_tilin + "\n2. " + elpepe + "\n3. " + benja );
			}
		}
		else if (benja > eso_tilin && benja > elpepe ) {
			if (eso_tilin < elpepe) {
				System.out.println("aca esta el orden de los numero \n1 " + benja + "\n2. " + elpepe + "\n3. " + eso_tilin );
			}
			else {
				System.out.println("aca esta el orden de los numero \n1 " + benja + "\n2. " + eso_tilin + "\n3. " + elpepe );
			}
		}
		else if (elpepe > benja && elpepe > eso_tilin) {
			if (benja < eso_tilin) {
				System.out.println("aca esta el orden de los numero \n1 " + elpepe + "\n2. " + eso_tilin + "\n3. " + benja );
			}
			else {
				System.out.println("aca esta el orden de los numero \n1 " + elpepe + "\n2. " + benja + "\n3. " + eso_tilin );
			}
		}
		
		
	}

}

