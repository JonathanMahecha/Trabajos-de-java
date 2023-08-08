public class Main {
    public static void main(String[] args) {
        String[][] matriz = {
            {"A", "B"},
            {"C", "D"},
            {"E", "F"}
        };

        System.out.println("Elementos de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

       
        int columna = 0; 
        String mayorEnColumna = encontrarMayorColumna(matriz, columna);
        System.out.println("Mayor número de la columna " + columna + ": " + mayorEnColumna);

        int fila = 1; 
        String menorEnFila = encontrarMenorFila(matriz, fila);
        System.out.println("Menor valor de la fila " + fila + ": " + menorEnFila);

        String puntoSilla = encontrarPuntoSilla(matriz);
        if (puntoSilla != null) {
            System.out.println("Punto de silla: " + puntoSilla);
        } else {
            System.out.println("No existe un punto de silla en la matriz.");
        }
    }

    public static String encontrarMayorColumna(String[][] matriz, int columna) {
        String mayor = matriz[0][columna];
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][columna].compareTo(mayor) > 0) {
                mayor = matriz[i][columna];
            }
        }
        return mayor;
    }

    public static String encontrarMenorFila(String[][] matriz, int fila) {
        String menor = matriz[fila][0];
        for (int j = 1; j < matriz[fila].length; j++) {
            if (matriz[fila][j].compareTo(menor) < 0) {
                menor = matriz[fila][j];
            }
        }
        return menor;
    }

    public static String encontrarPuntoSilla(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String valorActual = matriz[i][j];
                String mayorEnColumna = encontrarMayorColumna(matriz, j);
                String menorEnFila = encontrarMenorFila(matriz, i);
                if (valorActual.equals(mayorEnColumna) && valorActual.equals(menorEnFila)) {
                    return valorActual;
                }
            }
        }
        return null;
    }
}
