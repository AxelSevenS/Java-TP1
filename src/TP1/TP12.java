import java.lang.Math;
import java.util.Scanner;

public class TP12 {

    /**
     * Affiche un arbre dans la console, avec les paramètres donnés
     *  @author         Axel Sevenet
     *  @param  height  La hauteur de l'arbre, plus spécifiquement, de ses branches.
     *  @param  margin  L'espace vide minimum qui entoure l'arbre
     */
    private static void displayChristmasTree(int height, int margin) {

        int center = Math.max(height + Math.max(margin - 1, 0), 7);
        int frameWidth = center * 2 + 1;
        int frameHeight = height + 2;

        System.out.println(center);

        String text = "";

        for (int i = 0; i < frameHeight; i++) {
            int treeWidth = i % height;
            for (int j = 0; j < frameWidth; j++) {
                text += Math.abs(center - j) > treeWidth ? "=" : "*";
            }
            text += '\n';
        }

        System.out.print( text );
    }

    public static void run(Scanner scanner) {

        while (true) {

            System.out.print("Entrez une valeur positive (0 pour terminer) : ");

            int input = scanner.nextInt();

            if (input == 0) return;

            if (input < 0) {
                System.out.println("Erreur, la valeur ne peut pas être négative.");
                continue;
            }

            displayChristmasTree(input, 3);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            run(scanner);
        }
    }
}
