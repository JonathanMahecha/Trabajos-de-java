import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> listaEmpleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados de " + nombre + ":");
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Salario: $" + empleado.getSalario() + ", Departamento: " + empleado.getDepartamento());
        }
    }

    public double calcularSalarioTotal() {
        double salarioTotal = 0.0;
        for (Empleado empleado : listaEmpleados) {
            salarioTotal += empleado.getSalario();
        }
        return salarioTotal;
    }
}
