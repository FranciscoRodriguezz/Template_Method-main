package Aplicado;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de AccesoProfesores
        AccesoProfesores accesoProfesores = new AccesoProfesores("contraseñaProfesor", "docProfesor");
        accesoProfesores.accesoProfesor();

        System.out.println();

        // Crear instancia de AccesoEstudiantes
        AccesoEstudiantes accesoEstudiantes = new AccesoEstudiantes("contraseñaEstudiante", "docEstudiante");
        accesoEstudiantes.accesoEstudiante();

        System.out.println();

        // Crear instancia de BasedeDatos
        BasedeDatos baseDeDatos = new BasedeDatos("jdbc:mysql://localhost:3306/db_name", "username", "password");
        baseDeDatos.conectar();
        baseDeDatos.consultar();
        baseDeDatos.cerrarConexion();
    }
}
