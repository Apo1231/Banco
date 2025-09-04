public class Cliente {
    private String nombre;
    private String direccion;
    private String id;

    public Cliente(String nombre, String direccion, String id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
    }

    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getId() { return id; }
}
