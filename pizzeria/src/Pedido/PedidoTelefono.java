package Pedido;
import Cliente.Cliente;
import Item.Item;


import java.util.ArrayList;

public class PedidoTelefono extends Pedido{

    private String telefono;

    public PedidoTelefono(Cliente cliente, String telefono, ArrayList<Item> items) {
        super(cliente, items);
        this.telefono = telefono;
    }



}
