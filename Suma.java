public class Suma {
    private int n1, n2, res;

    // Método para realizar la suma de los dos operandos y devolver el resultado
    public int mostrarResultado() {
        res = n1 + n2; // Suma los dos operandos y guarda el resultado en la variable res
        return res; // Devuelve el resultado de la suma
    }

    // Métodos getter y setter para el primer operando (n1)
    public int getN1() {
        return n1; // Devuelve el valor del primer operando
    }

    public void setN1(int n1) {
        this.n1 = n1; // Establece el valor del primer operando con el valor proporcionado
    }

    // Métodos getter y setter para el segundo operando (n2)
    public int getN2() {
        return n2; // Devuelve el valor del segundo operando
    }

    public void setN2(int n2) {
        this.n2 = n2; // Establece el valor del segundo operando con el valor proporcionado
    }

    // Métodos getter y setter para el resultado de la suma
    public int getRes() {
        return res; // Devuelve el resultado de la suma
    }

    public void setRes(int res) {
        this.res = res; // Establece el resultado de la suma con el valor proporcionado
    }

    // Método toString para representar el objeto Suma como una cadena de texto
    @Override
    public String toString() {
        // Retorna una cadena que representa el objeto Suma con sus valores actuales
        return "Suma [n1=" + n1 + ", n2=" + n2 + ", res=" + res + "]";
    }
}
