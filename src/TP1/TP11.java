package TP1;

import java.lang.Math;
import java.util.Scanner;

public class TP11 {

    /**
     *  @author         Axel Sevenet
     *  @param  number  Le nombre dont il faut afficher la racine carrée
     */
    private static void displaySquareRoot(int number) {
        System.out.printf( "La racine de %d est : %f\n", number, Math.sqrt(number) );
    }

    public static void run(Scanner scanner) {

        while (true) {

            System.out.print("Entrez une valeur positive (0 pour terminer) : ");

            // Get int from terminal input
            int input = scanner.nextInt();

            if (input == 0) return;

            if (input < 0) {
                System.out.println("Erreur, la valeur ne peut pas être négative.");
                continue;
            }

            displaySquareRoot(input);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            run(scanner);
        }
    }
}
