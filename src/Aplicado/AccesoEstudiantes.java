package Aplicado;

public class AccesoEstudiantes extends AccesoPlataforma {
    public AccesoEstudiantes(String contraseña, String no_documento) {
        super(contraseña, no_documento);
    }

    @Override
    public void validarInformacion() {
        System.out.println("Validando información para acceso de estudiantes...");
        // Lógica de validación específica para estudiantes
    }

    @Override
    public void recopilarInformacion() {
        System.out.println("Recopilando información para acceso de estudiantes...");
        // Lógica de recopilación de información específica para estudiantes
    }

    @Override
    public boolean verificarEstudiante() {
        System.out.println("Verificando estudiante para acceso de estudiantes...");
        // Lógica de verificación de estudiante específica para estudiantes
        return true;  // Simulación de verificación exitosa
    }

    @Override
    public boolean mostrarPaginaEstudiante() {
        System.out.println("Mostrando página de estudiante para acceso de estudiantes...");
        // Lógica para mostrar la página del estudiante específica para estudiantes
        return true;  // Simulación de mostrar página exitosa
    }

    public void accesoEstudiante() {
        procesoAcceso();
    }

    public static void main(String[] args) {
        AccesoEstudiantes accesoEstudiantes = new AccesoEstudiantes("contraseñaEstudiante", "docEstudiante");
        accesoEstudiantes.accesoEstudiante();
    }
}
