import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para Distribución de productos de Salud");
        String lastOption="";
        while (!lastOption.equalsIgnoreCase("x")) {
            lastOption = displayMenu(scanner);
        }
        System.out.println("\n Saliendo del programa ...\n");
        //System.out.print("Dime la cantidad ");
        //System.out.print(" Dime tu nombre: ");
        //System.out.print("Dime tu apellido: ");
        //System.out.print("Dime la ciudad a donde tiene que ir el pedido");
    }

    private static String displayMenu(Scanner scanner) throws Throwable {
        System.out.println("Elige el producto que quieres comprar");
        System.out.println("1. Analgésicos");
        System.out.println("2. Apósitos");
        System.out.println("3. Tijeras");
        System.out.println("4. Jabón antiséptico");
        System.out.println("5. Guantes");
        System.out.println("6. Termómetro");
        System.out.println("7. Algodón");
        System.out.println("8. Alcohol");
        System.out.println("9. Iodo");
        System.out.println("10. Agua Oxigenada");
        System.out.println("X.  Salir del programa.");
        System.out.print("Elige una opción: ");
        String option = scanner.next();
        switch (option) {
            case "1":
                System.out.println("1");
                ;//performPatientEntry(scanner);
                return option;
            case "2":
                System.out.println("2");
                ;//performAllAppointments();
                return option;
            case "3":
                System.out.println("3");
                return option;
            case "4":
                System.out.println("4");
            case "5":
                System.out.println("5");
            case "6":
                System.out.println("6");
            case "7":
                System.out.println("7");
            case "8":
                System.out.println("8");
            case "9":
                System.out.println("9");
            case "10":
                System.out.println("10");
            default:
                System.out.println("Elección incorrecta , elige otra \n");
                return option;
        }
    }
}