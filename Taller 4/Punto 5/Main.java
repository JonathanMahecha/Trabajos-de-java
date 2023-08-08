import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedMap<String, String> libros = new TreeMap<>();

        System.out.println("Ingresa títulos de libros y sus autores (Ingresa 'fin' para detener):");
        while (true) {
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            if (titulo.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            libros.put(autor, titulo);
        }

        System.out.println("\nMapa completo:");
        for (String autor : libros.keySet()) {
            String titulo = libros.get(autor);
            System.out.println("Autor: " + autor + ", Título: " + titulo);
        }

        System.out.println("\nIngrese el rango para obtener el submapa (inicio y fin):");
        System.out.print("Clave de inicio (autor): ");
        String inicio = scanner.nextLine();
        System.out.print("Clave de fin (autor): ");
        String fin = scanner.nextLine();

        SortedMap<String, String> subMapa = libros.subMap(inicio, fin);
        System.out.println("\nSubmapa por rango:");
        for (String autor : subMapa.keySet()) {
            String titulo = subMapa.get(autor);
            System.out.println("Autor: " + autor + ", Título: " + titulo);
        }

        System.out.println("\nIngrese una clave (autor) para obtener el submapa:");
        String clave = scanner.nextLine();

        SortedMap<String, String> subMapaClave = libros.tailMap(clave);
        System.out.println("\nSubmapa a partir de la clave dada:");
        for (String autor : subMapaClave.keySet()) {
            String titulo = subMapaClave.get(autor);
            System.out.println("Autor: " + autor + ", Título: " + titulo);
        }

        scanner.close();
    }
}
