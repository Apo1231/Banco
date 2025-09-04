import java.util.ArrayList;

class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Cliente titular;
    private ArrayList<Transaccion> historial;

    public Cuenta(String numeroCuenta, Cliente titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historial = new ArrayList<>();
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        historial.add(new Transaccion("Deposito", cantidad));
    }

    public boolean retirar(double cantidad) {
        if (cantidad > saldo) return false;
        saldo -= cantidad;
        historial.add(new Transaccion("Retiro", cantidad));
        return true;
    }

    public double getSaldo() { return saldo; }
    public String getNumeroCuenta() { return numeroCuenta; }
    public Cliente getTitular() { return titular; }

    public void mostrarHistorial() {
        System.out.println("Historial de transacciones de la cuenta " + numeroCuenta + ":");
        for (Transaccion t : historial) {
            System.out.println(t.getTipo() + " de " + t.getMonto() + " el " + t.getFecha());
        }
    }
}