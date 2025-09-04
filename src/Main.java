
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "Calle Falsa 123", "12345");
        Cuenta cuenta = new Cuenta("001", cliente, 1000.0);

        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cuenta.depositar(200);
        System.out.println("Después de depositar 200: " + cuenta.getSaldo());
        cuenta.retirar(500);
        System.out.println("Después de retirar 500: " + cuenta.getSaldo());
    }
}