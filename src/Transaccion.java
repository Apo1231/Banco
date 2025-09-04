class Transaccion {
    private String tipo; // "Deposito" o "Retiro"
    private double monto;
    private String fecha;

    public Transaccion(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = java.time.LocalDate.now().toString();
    }

    public String getTipo() { return tipo; }
    public double getMonto() { return monto; }
    public String getFecha() { return fecha; }
}