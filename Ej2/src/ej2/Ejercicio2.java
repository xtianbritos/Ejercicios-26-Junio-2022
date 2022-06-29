
package ej2;

public class Ejercicio2 {
    int millas;
    double kilo;

    public void conversor(int ml){
        this.kilo = ml*16093;
        System.out.println(ml+" millas equivalen a "+this.kilo+"0 kilometros");
    }

    public static void main(String[] args) {
        Ejercicio2 ej = new Ejercicio2();

        ej.conversor(1);
    }
}

