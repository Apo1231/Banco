import java.util.ArrayList;

public class App {
    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public Cuenta buscarCuenta(String numero) {
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta().equals(numero)) return c;
        }
        return null;
    }
}