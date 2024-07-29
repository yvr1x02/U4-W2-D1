package es1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println("array iniziale" + Arrays.toString(array));


        while (true) {
            System.out.println("inserisci un numero ( inserisci 0 per uscire)");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("hai inserito il numero 0 il programma è stato terminato");
                break;
            }
           

            System.out.println("inserisci la posizione 0-4");
            int posizione = scanner.nextInt();

            try {
                array[posizione] = numero;
                System.out.println("Array aggiornato" + Arrays.toString(array));


            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("il numero inserito non corrisponde a nessuna posizione");
            }

        }

    }
}
