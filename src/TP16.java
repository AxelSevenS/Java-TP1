import java.util.Scanner;

public class TP16 {

    public static String nicifyDouble(double number) {
        if(number == (long) number)
            return String.format("%d",(long)number);
        else
            return String.format("%s",number);
    }

    public static double[][] get2DArrayFromInput(Scanner scanner) {
        int size = -1;

        while (size < 0) {
            System.out.println("Entrez la taille du tableau : ");
            System.out.println("    0- Sortir");
            size = scanner.nextInt();
        }

        if (size == 0) return null;

        double[][] array = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Entrez la valeur de l'élément [%d,%d] : ", i, j);
                array[i][j] = scanner.nextFloat();
            }
        }
        return array;
    }

    public static double getRowSum(double[][] array, int row) {
        double sum = 0;
        for (double number : array[row]) {
            sum += number;
        }
        return sum;
    }

    public static double getColumnSum(double[][] array, int column) {
        double sum = 0;
        for (double[] row : array) {
            sum += row[column];
        }
        return sum;
    }

    public static double get2DArraySum(double[][] array) {
        double sum = 0;
        for (double[] row : array) {
            for (double number : row) {
                sum += number;
            }
        }
        return sum;
    }

    public static void display2DArray(double[][] array) {
        String[][] displayArray = new String[array.length + 1][array.length + 1];

        for (int i = 0; i < displayArray.length; i++) {
            for (int j = 0; j < displayArray.length; j++) {
                if (i < array.length && j < array.length) {
                    displayArray[i][j] = String.format("%s", array[i][j]);
                } else if (i == array.length && j == array.length) {
                    displayArray[i][j] = String.format("(%s)", get2DArraySum(array)/(array.length) ).toString();
                } else if (i == array.length) {
                    displayArray[i][j] = String.format("(%s)", getColumnSum(array, j)/array.length ).toString();
                } else if (j == array.length) {
                    displayArray[i][j] = String.format("(%s)", getRowSum(array, i)/array.length ).toString();
                }
            }
        }

        for (String[] strings : displayArray) {
            for (int j = 0; j < displayArray.length; j++) {
                System.out.printf("%s\t", strings[j]);
            }
            System.out.println();
        }
    }

    public static void run(Scanner scanner) {

        while (true) {
            double[][] array = get2DArrayFromInput(scanner);
            if (array == null) break;

            display2DArray(array);

        }

    }
}
