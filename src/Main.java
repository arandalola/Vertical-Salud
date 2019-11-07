import java.sql.SQLOutput;
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
                rellenarPedido(scanner,"Analgesicos");
                ;//performPatientEntry(scanner);
                return option;
            case "2":
                rellenarPedido(scanner,"Apositos");
                ;//performAllAppointments();
                return option;
            case "3":
                rellenarPedido(scanner,"Tijeras");
                return option;
            case "4":
                rellenarPedido(scanner,"Jabon antiseptico");
            case "5":
                rellenarPedido(scanner,"Guantes");
            case "6":
                rellenarPedido(scanner,"Termometro");
            case "7":
                rellenarPedido(scanner,"Algodon");
            case "8":
                rellenarPedido(scanner,"Alcohol");
            case "9":
                rellenarPedido(scanner,"Iodo");
            case "10":
                rellenarPedido(scanner,"Agua oxigenada");
            default:
                System.out.println("Elección incorrecta , elige otra \n");
                return option;
        }
    }
    private static void rellenarPedido (Scanner scanner, String product){
            int amount=0;
            String first_name ="";
            String last_name ="";
            String address ="";
            String city ="";


            System.out.println("\n\n Estamos haciendo el pedido de " + product + " :\n");
            System.out.print("dime la cantidad: ");
            amount = scanner.nextInt();
            System.out.println("vamos a rellenar los datos personales del cliente:");
            System.out.print("Dame tu nombre: ");
            first_name = scanner.next();
            System.out.print("\n Dame tu apellido: ");
            last_name = scanner.next();
            System.out.println("\n Dame la dirección de entrega: ");
            System.out.print("Calle: ");
            address = scanner.next();
            System.out.println("nº: ");
            address +=" "+scanner.next();
            System.out.println("Dame el piso: ");
            address +=" "+scanner.next();
            System.out.println("Dame la puerta");
            address +=" "+scanner.next();
            System.out.println("Dame el codigo postal");
            address +=" "+scanner.next();
            System.out.println("Dame la ciudad: ");
            city =scanner.next();
            address +=" "+city;
            pedido(product,amount ,first_name,last_name , address);


    }

    private static void pedido(String n, int amount, String first_name, String last_name, String address) {
        System.out.println("\n\n Los datos del pedido realizado son : ");
        System.out.println("Producto: "+n+"\n cantidad: "+amount);
        System.out.println("Nombre del cliente: "+first_name+" "+last_name);
        System.out.println("Dirección de envío: "+address+" \n\n");

    }

}