public class Punto6 {
        public static char caracterEntrada(String cadena, int posicion) throws Exception {
            int longitudCadena = cadena.length();
            
            if (posicion >= 0 && posicion < longitudCadena) {
                return cadena.charAt(posicion);
            } else {
                throw new Exception("La posición está fuera del rango válido.");
            }
        }
    }
    

