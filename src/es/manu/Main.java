package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] serie1 = new  int[5], serie2 = new  int[5];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bamo a azé la primeica array: ");
        for (int i = 0; i < serie1.length; i++) {
            System.out.print("Numerico " + (i + 1) + " : ");
            serie1[i] = entrada.nextInt();
        }

        for (int i = 0; i < serie1.length; i++) {
            serie2[serie2.length - i - 1] = serie1[i];
        }

        System.out.println("Array 1: ");
        for (int i = 0; i < serie1.length; i++) {
            System.out.print(serie1[i] + " ");
        }
        System.out.println();

        System.out.println("Array 2: ");
        for (int i = 0; i < serie2.length; i++) {
            System.out.print(serie2[i] + " ");
        }
    }
}
