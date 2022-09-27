package TP1;

import java.util.Scanner;

public class TP16 {


    public static void run(Scanner scanner) {

        while (true) {
            double[][] array = ArrayUtil.number2DArrayFromInput(scanner);
            if (array.length == 0) break;

            ArrayUtil.display(array);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            run(scanner);
        }
    }
}
