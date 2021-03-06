package metodoquicksort;

import java.util.Random;
import java.util.Scanner;

public class Metodoquicksort {

    public static void main(String[] args) {
        Random miAleatorio = new Random();
        AlgoritmoDeOrdenamiento ordenar = new AlgoritmoDeOrdenamiento();
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos de su Arreglo");
        int tam = valor.nextInt();
        int num;
        int vector[] = new int[tam];

        for (int i = 0; i < vector.length; i++) {
            num = (int) (miAleatorio.nextDouble() * 1000000);
            vector[i] = num;
        }
        System.out.println("Arreglo Original");
        ordenar.mostrarArreglo(vector);
        System.out.println("Arreglo Ordenado con Quick");
        ordenar.quick(vector, 0, vector.length - 1);
    }

}
