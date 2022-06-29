package Ejercicio;

public class Ejercicio1 {
    int num;

    public void parOImpar(int num) {
        System.out.println(num % 2 == 0 ? "El numero es par" : "El numero es impar");
    }

    public static void main(String[] args) {
        Ejercicio1 ej = new Ejercicio1();

        ej.parOImpar(22);
    }
}
