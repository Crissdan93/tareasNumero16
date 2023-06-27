package tareasdia16;

import java.util.Scanner;

public class ejercicio1 {
    public String verificar(int numero) {
        if (numero > 0) {
            return "El número es positivo.";
        } else if (numero < 0) {
            return "El número es negativo.";
        } else {
            return "El número es cero.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        ejercicio1 verificador = new ejercicio1();
        String resultado = verificador.verificar(numero);
        System.out.println(resultado);
    }
}