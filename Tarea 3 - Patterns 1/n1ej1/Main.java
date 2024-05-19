package n1ej1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Undo undo = Undo.getInstance();
        int opcion = 0;


        do {

            System.out.println("Seleccione qué opción desea realizar: "
                    + "1. Añadir pedido\n "
                    + "2. Eliminar último pedido\n"
                    + "3.  Imprimir historial de pedidos\n"
                    + "4.  Salir\n");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el pedido a añadir: ");
                    String pedido = input.next();
                    undo.addPedido(pedido);
                    break;
                case 2:
                    undo.removeUltimoPedido();
                    break;
                case 3:
                    undo.imprimirPedidos();
                    break;
                case 4:
                    System.out.println("Hasta pronto!");
                    input.close();

                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 4);


    }
}