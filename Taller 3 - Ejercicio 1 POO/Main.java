public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion("Camión Volvo", 25000.0, 10);

        System.out.println("Nombre del camión: " + camion.getNombre());
        System.out.println("Precio del camión: $" + camion.getPrecio());
        System.out.println("Número de ruedas del camión: " + camion.getNroRuedas());

        double tasa = camion.calcularTasa();
        System.out.println("Tasa de impuesto anual del camión: $" + tasa);
    }
}
