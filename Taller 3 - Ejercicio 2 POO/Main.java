public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan Pérez", 3000.0, "Ventas");
        Empleado emp2 = new Empleado("María Gómez", 4000.0, "Recursos Humanos");

        Empresa miEmpresa = new Empresa("Mi Empresa");

        miEmpresa.agregarEmpleado(emp1);
        miEmpresa.agregarEmpleado(emp2);

        miEmpresa.mostrarEmpleados();

        double salarioTotal = miEmpresa.calcularSalarioTotal();
        System.out.println("Salario total de la empresa: $" + salarioTotal);
    }
}
