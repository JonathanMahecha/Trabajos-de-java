import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una oración o frase: ");
        String frase = scanner.nextLine();

        int cantidadPalabras = 1;
        for (char c : frase.toCharArray()) {
            if (c == ' ') {
                cantidadPalabras++;
            }
        }

        System.out.println("La cantidad de palabras en la frase es: " + cantidadPalabras);
    }
}
