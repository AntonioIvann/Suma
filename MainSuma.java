import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainSuma {
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner su = new Scanner(System.in); // Crea un objeto Scanner llamado su para leer la entrada del usuario

        // Solicita al usuario que ingrese el primer valor
        System.out.println("Dame el primer valor: ");
        int n1 = su.nextInt(); // Lee el primer valor proporcionado por el usuario

        // Solicita al usuario que ingrese el segundo valor
        System.out.println("Dame el segundo valor: ");
        int n2 = su.nextInt(); // Lee el segundo valor proporcionado por el usuario

        Suma su1 = new Suma(); // Crea un objeto de la clase Suma llamado su1

        // Establece los valores proporcionados por el usuario en el objeto su1
        su1.setN1(n1);
        su1.setN2(n2);

        // Llama al método mostrarResultado() de su1 para mostrar el resultado de la suma
        su1.mostrarResultado();

        // Imprime el resultado de la suma utilizando el método mostrarResultado() de su1
        System.out.println("El resultado de la suma es: " + su1.mostrarResultado());

        // Imprime una representación en cadena del objeto su1 utilizando su método toString()
        System.out.println(su1.toString());
    }
}
