public class CuentaBancaria {
    private double saldo;
    private String titular;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente. No es posible realizar el retiro.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual de la cuenta de " + titular + ": $" + saldo);
    }
}
