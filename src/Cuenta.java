public class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private Cliente titular;

    public Cuenta(String numeroCuenta, Cliente titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if (cantidad > saldo) return false;
        saldo -= cantidad;
        return true;
    }

    public double getSaldo() { return saldo; }
    public String getNumeroCuenta() { return numeroCuenta; }
    public Cliente getTitular() { return titular; }

}
