package tareasdia16;

import java.util.Scanner;

public class ejercicio3 {
	
	public class VerificadorBisiesto {
	    public static boolean esBisiesto(int año) {
	        return año % 4 == 0 && (año % 100 != 0 || año % 400 == 0);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un año: ");
	        int año = scanner.nextInt();

	        if (esBisiesto(año)) {
	            System.out.println("El año es bisiesto.");
	        } else {
	            System.out.println("El año no es bisiesto.");
	        }
	    }
	}

}
