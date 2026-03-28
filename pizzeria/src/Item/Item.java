package Item;

public class Item {

    private static int contadorId = 0;
    private int id;
    private String nombre;
    private int valor;

    public Item(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
        this.id = contadorId;
        contadorId++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }




}
