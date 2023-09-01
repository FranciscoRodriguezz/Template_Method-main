package Sin_Aplicar;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    AccesoProfesor profesor = new AccesoProfesor("001", "abc123");
    profesor.recopilarInformacion();
    profesor.consultar();
    profesor.mostrarPaginaProfesor();
    profesor.cerrarConexion();
    }
}