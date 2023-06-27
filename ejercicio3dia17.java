package tareasdia17;

public class ejercicio3dia17 {
	
	public class SumaNaturales {
	    public static int calcularSumaNaturales() {
	        int suma = 0;
	        for (int i = 1; i <= 100; i++) {
	            suma += i;
	        }
	        return suma;
	    }

	    public static void main(String[] args) {
	        int resultado = calcularSumaNaturales();
	        System.out.println("La suma de los primeros 100 números naturales es: " + resultado);
	    }
	}

}
