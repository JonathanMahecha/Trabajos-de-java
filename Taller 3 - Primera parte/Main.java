public class Main {
    public static void main(String[] args) {
        
        Carro miCarro = new Carro("Toyota", "Corolla", 2022);
        miCarro.mostrarInformacion();

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez");
        cuenta1.depositar(1000);
        cuenta1.mostrarSaldo();
        cuenta1.retirar(500);
        cuenta1.mostrarSaldo();

        Tienda tienda = new Tienda();
        tienda.agregarProducto("Camiseta");
        tienda.agregarProducto("Pantalón");
        tienda.agregarProducto("Zapatos");
        tienda.mostrarProductos();
        tienda.eliminarProducto("Pantalón");
        tienda.mostrarProductos();
    }
}
