import java.util.Scanner;

public class TP14 {

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
}
