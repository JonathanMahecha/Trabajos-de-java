import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de caracteres: ");
        String lect_teclado = scanner.nextLine();

        try {
            char resultado = EjercicioAnterior.caracterEntrada(lect_teclado, 7);
            System.out.println("El caracter en la posición 7 es: " + resultado);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }
    }
}
