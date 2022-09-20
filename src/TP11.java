import java.lang.Math;
import java.util.Scanner;

public class TP11 {

    private static void displaySquareRoot(int number) {
        System.out.println( String.format( "La racine de %o est : %f", number, Math.sqrt(number) ) );
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
}
