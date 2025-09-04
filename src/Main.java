import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App banco = new App();

        while (true) {
            System.out.println("\n--- MENU BANCO ---");
            System.out.println("1. Crear cliente y cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Ver historial");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (opcion == 1) {
                System.out.print("Nombre del cliente: ");
                String nombre = sc.nextLine();
                System.out.print("Direccion: ");
                String direccion = sc.nextLine();
                System.out.print("ID del cliente: ");
                String id = sc.nextLine();
                Cliente cliente = new Cliente(nombre, direccion, id);

                System.out.print("Numero de cuenta: ");
                String numCuenta = sc.nextLine();
                System.out.print("Saldo inicial: ");
                double saldo = sc.nextDouble();
                Cuenta cuenta = new Cuenta(numCuenta, cliente, saldo);
                banco.agregarCuenta(cuenta);

                System.out.println("Cuenta creada exitosamente para " + cliente.getNombre());

            } else if (opcion == 2) {
                System.out.print("Numero de cuenta: ");
                String numCuenta = sc.nextLine();
                Cuenta cuenta = banco.buscarCuenta(numCuenta);
                if (cuenta != null) {
                    System.out.print("Monto a depositar: ");
                    double monto = sc.nextDouble();
                    cuenta.depositar(monto);
                    System.out.println("Deposito exitoso. Saldo actual: " + cuenta.getSaldo());
                } else {
                    System.out.println("Cuenta no encontrada.");
                }

            } else if (opcion == 3) {
                System.out.print("Numero de cuenta: ");
                String numCuenta = sc.nextLine();
                Cuenta cuenta = banco.buscarCuenta(numCuenta);
                if (cuenta != null) {
                    System.out.print("Monto a retirar: ");
                    double monto = sc.nextDouble();
                    if (cuenta.retirar(monto)) {
                        System.out.println("Retiro exitoso. Saldo actual: " + cuenta.getSaldo());
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                } else {
                    System.out.println("Cuenta no encontrada.");
                }

            } else if (opcion == 4) {
                System.out.print("Numero de cuenta: ");
                String numCuenta = sc.nextLine();
                Cuenta cuenta = banco.buscarCuenta(numCuenta);
                if (cuenta != null) {
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                } else {
                    System.out.println("Cuenta no encontrada.");
                }

            } else if (opcion == 5) {
                System.out.print("Numero de cuenta: ");
                String numCuenta = sc.nextLine();
                Cuenta cuenta = banco.buscarCuenta(numCuenta);
                if (cuenta != null) {
                    cuenta.mostrarHistorial();
                } else {
                    System.out.println("Cuenta no encontrada.");
                }

            } else if (opcion == 6) {
                System.out.println("Saliendo del sistema...");
                break;
            } else {
                System.out.println("Opcion invalida.");
            }
        }

        sc.close();
    }
}