package Aplicado;

public class BasedeDatos {
    // Simulación de información de conexión a la base de datos
    private String url;
    private String usuario;
    private String contraseña;

    public BasedeDatos(String url, String usuario, String contraseña) {
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public void conectar() {
        System.out.println("Conectando a la base de datos...");
        // Lógica de conexión a la base de datos
        System.out.println("Conexión exitosa");
    }

    public void consultar() {
        System.out.println("Realizando consulta en la base de datos...");
        // Lógica de consulta en la base de datos
        System.out.println("Consulta realizada");
    }

    public void cerrarConexion() {
        System.out.println("Cerrando conexión a la base de datos...");
        // Lógica de cierre de conexión a la base de datos
        System.out.println("Conexión cerrada");
    }

    public static void main(String[] args) {
        BasedeDatos baseDeDatos = new BasedeDatos("jdbc:mysql://localhost:3306/db_name", "username", "password");

        baseDeDatos.conectar();
        baseDeDatos.consultar();
        baseDeDatos.cerrarConexion();
    }
}
