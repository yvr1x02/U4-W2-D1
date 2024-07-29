package es2;

import java.util.Scanner;

/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di km percorsi");
            int km = scanner.nextInt();

            System.out.println("Inserisci il numero di litri di carburante consumati");
            int litri = scanner.nextInt();

            int kmPerLitro = km / litri;
            System.out.println("Km per litro percorsi: " + kmPerLitro);
        } catch (ArithmeticException e) {
            System.out.println("Non puoi dividere per 0, utilizza un altro valore");

        }
    }
}
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di km percorsi");
            double km = scanner.nextInt();

            System.out.println("Inserisci il numero di litri di carburante consumati");
            double litri = scanner.nextInt();

            double kmPerLitro = km / litri;
            System.out.println("Km per litro percorsi: " + kmPerLitro);
        } catch (ArithmeticException e) {
            System.out.println("Non puoi dividere per 0, utilizza un altro valore");

        }
    }
}
