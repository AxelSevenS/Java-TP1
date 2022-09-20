import java.util.Scanner;

public class TP15 {

    public static float[] getArrayFromInput(Scanner scanner) {
        int size = 0;

        while (size < 1) {
            System.out.print("Entrez la taille du tableau : ");
            size = scanner.nextInt();
        }

        float[] array = new float[size];
        for (int i = 0; i < size; i++) {
            System.out.print( String.format("Entrez la valeur de l'élément %d : ", i) );
            array[i] = scanner.nextFloat();
        }
        return array;
    }

    public static void run(Scanner scanner) {

        while (true) {

            double sum = 0;
            for (double number : getArrayFromInput(scanner)) {
                sum += number;
            }

            System.out.println( String.format("La somme du tableau est %f", sum) );


        }

    }
}
