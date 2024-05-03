import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.println("Dame el primer valor: ");
        int n1 = su.nextInt();
        System.out.println("Dame el segundo valor: ");
        int n2 = su.nextInt();

        Suma su1 = new Suma();
        su1.setN1(n1);
        su1.setN2(n2);
        su1.mostrarResultado();
        System.out.println("El resultado de la suma es: " + su1.mostrarResultado());
        System.out.println(su1.toString());
    }
}
