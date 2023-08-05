import java.util.ArrayList;

public class Tienda {
    private ArrayList<String> listaProductos;

    public Tienda() {
        listaProductos = new ArrayList<>();
    }

    public void agregarProducto(String producto) {
        listaProductos.add(producto);
    }

    public void eliminarProducto(String producto) {
        listaProductos.remove(producto);
    }

    public void mostrarProductos() {
        System.out.println("Productos disponibles en la tienda:");
        for (String producto : listaProductos) {
            System.out.println("- " + producto);
        }
    }
}
