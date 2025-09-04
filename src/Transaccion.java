public class Transaccion {
    private String tipo; // "Depósito" o "Retiro"
    private double monto;
    private String fecha;

    public Transaccion(String tipo, double monto, String fecha) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getTipo() { return tipo; }
    public double getMonto() { return monto; }
    public String getFecha() { return fecha; }
}