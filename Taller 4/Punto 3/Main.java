import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaCadenas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Agrega elementos a la lista (escribe 'fin' para detener):");
        while (true) {
            String cadena = scanner.nextLine();
            if (cadena.equalsIgnoreCase("fin")) {
                break;
            }
            listaCadenas.add(cadena);
        }

        System.out.println("Elementos en la lista:");
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
        }

        System.out.println("Escribe el índice del elemento que deseas eliminar (0 - " + (listaCadenas.size() - 1) + "):");
        int indiceEliminar = scanner.nextInt();
        if (indiceEliminar >= 0 && indiceEliminar < listaCadenas.size()) {
            listaCadenas.remove(indiceEliminar);
            System.out.println("Elemento eliminado correctamente.");
        } else {
            System.out.println("Índice inválido. No se eliminó ningún elemento.");
        }

        System.out.println("Elementos en la lista después de eliminar:");
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
        }

        scanner.close();
    }
}
