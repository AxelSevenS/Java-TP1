import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choisissez un TP :");
            System.out.println("    0- Sortir");
            System.out.println("    1- TP11");
            System.out.println("    2- TP12");
            System.out.println("    3- TP13");
            System.out.println("    4- TP14");
            System.out.println("    5- TP15");
            System.out.println("    6- TP16");
            int input = scanner.nextInt();
    
            switch (input) {
                case 1:
                    TP11.run(scanner);
                    break;
                case 2:
                    TP12.run(scanner);
                    break;
                case 3:
                    TP13.run(scanner);
                    break;
                case 4:
                    TP14.run(scanner);
                    break;
                case 5:
                    TP15.run(scanner);
                    break;
                case 6:
                    TP16.run(scanner);
                    break;
                default:
                    return;
            }
        }
        
    }
}
