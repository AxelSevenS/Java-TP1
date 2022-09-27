package TP1;

import java.util.Scanner;

public class TP15 {


    public static void run(Scanner scanner) {

        while (true) {

            double[] array = ArrayUtil.numberArrayFromInput(scanner);
            double sum = ArrayUtil.sum(array);

            System.out.printf( "La somme du tableau est %f\n", sum );

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            run(scanner);
        }
    }
}
