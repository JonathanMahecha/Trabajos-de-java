import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Estudiante> listaEstudiantes = new LinkedList<>();

        listaEstudiantes.add(new Estudiante("Juan", 20, 8.5));
        listaEstudiantes.add(new Estudiante("María", 22, 9.0));
        listaEstudiantes.add(new Estudiante("Pedro", 19, 7.8));
        listaEstudiantes.add(new Estudiante("Laura", 21, 9.2));

        System.out.println("Estudiantes en la lista:");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad() + ", Promedio: " + estudiante.getPromedio());
        }

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getNombre().equals("Juan")) {
                listaEstudiantes.remove(estudiante);
                break;
            }
        }

        System.out.println("\nEstudiantes en la lista después de eliminar:");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad() + ", Promedio: " + estudiante.getPromedio());
        }

        Estudiante mejorEstudiante = obtenerMejorEstudiante(listaEstudiantes);
        System.out.println("\nMejor estudiante: " + mejorEstudiante.getNombre() + ", Promedio: " + mejorEstudiante.getPromedio());

        Estudiante peorEstudiante = obtenerPeorEstudiante(listaEstudiantes);
        System.out.println("Peor estudiante: " + peorEstudiante.getNombre() + ", Promedio: " + peorEstudiante.getPromedio());

        // Calcular el promedio de los estudiantes
        double promedioTotal = calcularPromedioTotal(listaEstudiantes);
        System.out.println("Promedio total de los estudiantes: " + promedioTotal);
    }

    public static Estudiante obtenerMejorEstudiante(LinkedList<Estudiante> estudiantes) {
        Estudiante mejorEstudiante = estudiantes.getFirst();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getPromedio() > mejorEstudiante.getPromedio()) {
                mejorEstudiante = estudiante;
            }
        }
        return mejorEstudiante;
    }

    public static Estudiante obtenerPeorEstudiante(LinkedList<Estudiante> estudiantes) {
        Estudiante peorEstudiante = estudiantes.getFirst();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getPromedio() < peorEstudiante.getPromedio()) {
                peorEstudiante = estudiante;
            }
        }
        return peorEstudiante;
    }

    public static double calcularPromedioTotal(LinkedList<Estudiante> estudiantes) {
        double sumaPromedios = 0.0;
        for (Estudiante estudiante : estudiantes) {
            sumaPromedios += estudiante.getPromedio();
        }
        return sumaPromedios / estudiantes.size();
    }
}
