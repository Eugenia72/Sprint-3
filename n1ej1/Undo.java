package n1ej1;


import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private List<String> pedidos;

    private Undo() {
        pedidos = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            synchronized (Undo.class) {
                if (instance == null) {
                    instance = new Undo();
                }
            }
        }
        return instance;
    }

    public void addPedido(String pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido agregado: " + pedido);
    }

    public void removeUltimoPedido() {
        if (!pedidos.isEmpty()) {
            String ultimoPedido = pedidos.remove(pedidos.size() - 1);
            System.out.println("Pedido eliminado: " + ultimoPedido);
        } else {
            System.out.println("No hay pedidos para eliminar.");
        }
    }

    public void imprimirPedidos() {
        if (!pedidos.isEmpty()) {
            System.out.println("Pedidos:");
            for (String pedido : pedidos) {
                System.out.println(pedido);
            }
        } else {
            System.out.println("No hay pedidos para imprimir.");
        }
    }
}

