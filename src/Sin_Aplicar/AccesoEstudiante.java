package Sin_Aplicar;

public class AccesoEstudiante implements BaseDeDatos {

    private String codigoEstudiante;
    private String contraseña;

    public AccesoEstudiante(String codigoEstudiante, String contraseña) {
        this.codigoEstudiante = codigoEstudiante;
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

    public boolean verificarEstudiante(){
        return true;
    }

    public void mostrarPaginaEstudiante(){
        System.out.println("mostrando pagina !!");
    }
}
