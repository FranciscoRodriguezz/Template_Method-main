package Aplicado;

public class AccesoProfesores extends AccesoPlataforma {
    public AccesoProfesores(String contraseña, String no_documento) {
        super(contraseña, no_documento);
    }

    @Override
    public void validarInformacion() {
        System.out.println("Validando información para acceso de profesores...");
        // Lógica de validación específica para profesores
    }

    @Override
    public void recopilarInformacion() {
        System.out.println("Recopilando información para acceso de profesores...");
        // Lógica de recopilación de información específica para profesores
    }

    @Override
    public boolean verificarEstudiante() {
        System.out.println("Verificando estudiante para acceso de profesores...");
        // Lógica de verificación de estudiante específica para profesores
        return false;  // Simulación de verificación fallida
    }

    @Override
    public boolean mostrarPaginaEstudiante() {
        System.out.println("Mostrando página de estudiante para acceso de profesores...");
        // Lógica para mostrar la página del estudiante específica para profesores
        return false;  // Simulación de mostrar página fallida
    }

    public void accesoProfesor() {
        procesoAcceso();
    }

    public static void main(String[] args) {
        AccesoProfesores accesoProfesores = new AccesoProfesores("contraseñaProfesor", "docProfesor");
        accesoProfesores.accesoProfesor();
    }
}
