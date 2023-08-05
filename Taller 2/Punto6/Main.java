public class Main {
        /**
         * @param args
         */
        public static void main(String[] args) {
            String ejemplo = "Hola, Mundo!";
            int posicion = 7;
            
            try {
                char caracter = Punto6.caracterEntrada(ejemplo, posicion);
                System.out.println("El carácter en la posición " + posicion + " es: " + caracter);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    

