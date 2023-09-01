package Aplicado;

public abstract class AccesoPlataforma {
    protected String contraseña;
    protected String no_documento;

    public AccesoPlataforma(String contraseña, String no_documento) {
        this.contraseña = contraseña;
        this.no_documento = no_documento;
    }

    public abstract void validarInformacion();

    public abstract void recopilarInformacion();

    public abstract boolean verificarEstudiante();

    public abstract boolean mostrarPaginaEstudiante();

    public final void procesoAcceso() {
        validarInformacion();
        recopilarInformacion();

        if (verificarEstudiante()) {
            mostrarPaginaEstudiante();
        } else {
            System.out.println("Acceso denegado. Verificación de estudiante fallida.");
        }
    }
}