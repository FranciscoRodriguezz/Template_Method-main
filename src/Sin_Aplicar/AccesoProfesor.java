package Sin_Aplicar;

public class AccesoProfesor implements BaseDeDatos {
    private String idProfesor;
    private String contraseña;

    public AccesoProfesor(String idProfesor, String contraseña) {
        this.idProfesor = idProfesor;
        this.contraseña = contraseña;
    }

    public void recopilarInformacion(){
        conectarBD();
    }

    public void conectarBD(){
        System.out.println("conectando a base de datos...");
        conectar();
    }

    @Override
    public void conectar() {
        System.out.println("conectado a la base de datos");
    }

    @Override
    public void consultar() {
        System.out.println("consultando...");
    }

    @Override
    public void cerrarConexion() {
        System.out.println("sesion cerrada");
    }

    public boolean verificarProfesor(){
        return false;
    }

    public void mostrarPaginaProfesor(){
         System.out.println(verificarProfesor() ? "mostrando pagina !!" : "no se puede mostrar pagina");

    }
}
