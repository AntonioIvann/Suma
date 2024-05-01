import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.println("Dame el primer valor: ");
        int n1 = su.nextInt();
        System.out.println("Dame el segundo valor: ");
        int n2 = su.nextInt();
        Suma su1 = new Suma();
        su1.n1 = n1;
        su1.n2 = n2;
        System.out.println("El resultado es: " + su1.mostrarResultado());

    }
}