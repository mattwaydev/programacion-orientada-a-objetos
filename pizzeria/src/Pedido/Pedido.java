package Pedido;

import Cliente.Cliente;
import Item.Item;

import java.util.ArrayList;

public abstract class Pedido {

    private Cliente cliente;
    private ArrayList<Item> items;

    public Pedido(Cliente cliente, ArrayList<Item> items) {
        this.cliente = cliente;
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Item> getItems() {
        return items;
    }





}
