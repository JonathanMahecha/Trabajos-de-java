public class Main {
    public static void main(String[] args) {
        int[] numeros = { 10, 5, 20, 15, 30, 25, 40, 35, 50, 45 };

        // Mostrar cada elemento del arreglo usando un bucle "for".
        System.out.println("Elementos del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
        }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("Suma de los elementos: " + suma);

        int maximo = numeros[0];
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("Número máximo: " + maximo);
        System.out.println("Número mínimo: " + minimo);
    }
}
