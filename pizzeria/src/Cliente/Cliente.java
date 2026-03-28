package Cliente;
import Pedido.Pedido;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean addPedido(Pedido pedido) {
        pedidos.add(pedido);
        return true;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
