package TP1;

import java.util.Scanner;

public class TP14 {

    /**
     * Calcule la somme des N premiers termes de la suite
     * Un = Un-1 + 1 / n avec n > 0 et U1 = 1
     *  @author     Axel Sevenet
     *  @param   n  Le nombre des termes de la suite à additionner
     *  @return     La somme des n premiers termes
     */
    public static double recursiveSequence(int n) {
        if (n == 1) return 1d;

        return recursiveSequence(n - 1) + 1d/n;
    }

    public static void run(Scanner scanner) {

        while (true) {

            System.out.println("Entrez le nombre de terme de la suite à calculer :");
            System.out.println("    0- Sortir");

            int input = scanner.nextInt();

            if (input == 0) return;

            if (input < 0) {
                System.out.println("Erreur, la valeur ne peut pas être négative.");
                continue;
            }

            System.out.println( recursiveSequence(input) );
            System.out.println( String.format("U%d est : %f", input, recursiveSequence(input)) );


        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            run(scanner);
        }
    }
}
