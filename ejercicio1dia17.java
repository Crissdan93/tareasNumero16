package tareasdia17;

public class ejercicio1 {
	
	public class TablaMultiplicar {
	    public static void imprimirTablaMultiplicar(int numero) {
	        for (int i = 1; i <= 10; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }
	    }

	    public static void main(String[] args) {
	        int numero = 7;
	        imprimirTablaMultiplicar(numero);
	    }
	}

}
