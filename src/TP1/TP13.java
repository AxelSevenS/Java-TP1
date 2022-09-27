import java.util.Scanner;

public class TP13 {

    /**
    *  @author          Axel Sevenet
    *  @param   binary  Le nombre en binaire à convertir en décimal
    *  @return          Le nombre, converti en décimal
    */
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            decimal += (binary % 10) * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        return decimal;
    }

    /**
     *  @author         Axel Sevenet
     *  @param  decimal Le nombre en décimal à convertir en binaire
     *  @return         Le nombre, converti en binaire
     */
    public static int decimalToBinary(int decimal) {
        int binary = 0;
        int power = 0;
        while (decimal > 0) {
            binary += (decimal % 2) * Math.pow(10, power);
            decimal /= 2;
            power++;
        }
        return binary;
    }

    public static void run(Scanner scanner) {

        while (true) {

            System.out.println("Voulez-vous convertir :");
            System.out.println("    1- un nombre décimal en binaire");
            System.out.println("    2- un nombre binaire en décimal");
            System.out.println("    0- Sortir");

            int input = scanner.nextInt();
            
            switch (input) {
                case 1 : {
                    System.out.print("Entrez un nombre décimal : ");
                    int decimal = scanner.nextInt();
                    System.out.println( String.format("Le nombre binaire correspondant est : %d", decimalToBinary(decimal)) );
                    break;
                }
                case 2 : {
                    System.out.print("Entrez un nombre binaire : ");
                    int binary = scanner.nextInt();
                    System.out.println( String.format("Le nombre décimal correspondant est : %d", binaryToDecimal(binary)) );
                    break;
                }
                case 0 :  {
                    return;
                }
                default : {
                    System.out.println("Erreur, la valeur doit être 1 ou 2.");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            run(scanner);
        }
    }
}
