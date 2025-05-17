public class AulaVirtual {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Constructor sin parametros
        System.out.println("Profesor, sin parametros");
        Profesor objProfesor=new Profesor();

        objProfesor.setCodProfesor("Elio");
        objProfesor.setNombreProfesor("Elio Lamar");
        objProfesor.setCedulaProfesor("9193242");
        objProfesor.setTelefonoProfesor("3107260284");
        objProfesor.setCorreoProfesor("eliolamar@gmail.com"); 
        objProfesor.setFechaNacimientoProfesor("02/04/1970");
        objProfesor.setDireccionProfesor("Calle 56 B 1 F 22");
        objProfesor.setCiudadProfesor("Soledad Atlantico");

        System.out.println("El codigo del Profesor es: " +objProfesor.getCodProfesor());
        System.out.println("El Nombre del Profesor es: " +objProfesor.getNombreProfesor());
        System.out.println("La cedula del Profesor es: " +objProfesor.getCedulaProfesor());
        System.out.println("El telefono del Profesor es: " +objProfesor.getTelefonoProfesor());
        System.out.println("El correo del Profesor es: " +objProfesor.getCorreoProfesor());
        System.out.println("La fecha de nacimiento del Profesor es: " +objProfesor.getFechaNacimientoProfesor());
        System.out.println("La direccion del Profesor es: " +objProfesor.getDireccionProfesor());
        System.out.println("La ciudad del Profesor es: " +objProfesor.getCiudadProfesor());

        System.out.println("Profesor, con parametros");

        Profesor objProfesor2=new Profesor("Elio2","Elio Lamar","9196242",
        "3107260284","eliolamar@gmail.com","02/04/1970","Calle 56 B 1F 22","Soledad Atlantico");

        System.out.println("El codigo del Profesor es: " +objProfesor2.getCodProfesor());
        System.out.println("El Nombre del Profesor es: " +objProfesor2.getNombreProfesor());
        System.out.println("La cedula del Profesor es: " +objProfesor2.getCedulaProfesor());
        System.out.println("El telefono del Profesor es: " +objProfesor2.getTelefonoProfesor());
        System.out.println("El correo del Profesor es: " +objProfesor2.getCorreoProfesor());
        System.out.println("La fecha de nacimiento del Profesor es: " +objProfesor2.getFechaNacimientoProfesor());
        System.out.println("La direccion del Profesor es: " +objProfesor2.getDireccionProfesor());
        System.out.println("La ciudad del Profesor es: " +objProfesor2.getCiudadProfesor());


        //Estudiante

        System.out.println("Estudiante, sin parametros");

        Estudiante objEstudiante=new Estudiante();

        objEstudiante.setCodEstudiante("E1");
        objEstudiante.setNombreEstudiante("Julia Acuña");
        objEstudiante.setCedulaEstudiante("102587453");
        objEstudiante.setTelefonoEstudiante("3182245863");
        objEstudiante.setCorreoEstudiante("juliaa20@gmail.com"); 
        objEstudiante.setFechaNacimientoEStudiante("12/09/2002");
        objEstudiante.setDireccionEstudiante("Cra 5G 33-45");
        objEstudiante.setCiudadEstudiante("Soledad Atlantico");

        System.out.println("El codigo del Estudiante es: " +objEstudiante.getCodEstudiante());
        System.out.println("El Nombre del Estudiante es: " +objEstudiante.getNombreEstudiante());
        System.out.println("La cedula del Estudiante es: " +objEstudiante.getCedulaEstudiante());
        System.out.println("El telefono del Estudiante es: " +objEstudiante.getTelefonoEstudiante());
        System.out.println("El correo del Estudiante es: " +objEstudiante.getCorreoEstudiante());
        System.out.println("La fecha de nacimiento del Estudiante es: " +objEstudiante.getFechaNacimientoEStudiante());
        System.out.println("La direccion del Estudiante es: " +objEstudiante.getDireccionEstudiante());
        System.out.println("La ciudad del Estudiante es: " +objEstudiante.getCiudadEstudiante());

        System.out.println("Estudiante, con parametros");

        Estudiante objEstudiante2=new Estudiante("E1","Julia Acuña","102587453",
        "3182245863","juliaa20@gmail.com","12/09/2002","Cra 5G 33-45","Soledad Atlantico");

        System.out.println("El codigo del Estudiante es: " +objEstudiante2.getCodEstudiante());
        System.out.println("El Nombre del Estudiante es: " +objEstudiante2.getNombreEstudiante());
        System.out.println("La cedula del Estudiante es: " +objEstudiante2.getCedulaEstudiante());
        System.out.println("El telefono del Estudiante es: " +objEstudiante2.getTelefonoEstudiante());
        System.out.println("El correo del Estudiante es: " +objEstudiante2.getCorreoEstudiante());
        System.out.println("La fecha de nacimiento del Estudiante es: " +objEstudiante2.getFechaNacimientoEStudiante());
        System.out.println("La direccion del Estudiante es: " +objEstudiante2.getDireccionEstudiante());
        System.out.println("La ciudad del Estudiante es: " +objEstudiante2.getCiudadEstudiante());

        //Programa

        System.out.println("Programa, sin parametros");

        Programa objPrograma=new Programa();

        objPrograma.setNombrePrograma("Enfermeria");
        objPrograma.setCodigoPrograma(001);

        System.out.println("El Nombre del Programa es: " +objPrograma.getNombrePrograma());
        System.out.println("El codigo del Programa es: " +objPrograma.getCodigoPrograma());

        System.out.println("Programa, con parametros");

        Programa objPrograma2=new Programa("Enfermeria",001);

        System.out.println("El Nombre del Programa es: " +objPrograma2.getNombrePrograma());
        System.out.println("El codigo del Programa es: " +objPrograma2.getCodigoPrograma());

        //Materia

        System.out.println("Materia, sin parametros");

        Materia objMateria=new Materia();

        objMateria.setNombreMateria("Biologia");
        objMateria.setCodigoMateria(001);
        
        System.out.println("El Nombre de la materia es: " +objMateria.getNombreMateria());
        System.out.println("El codigo de la materia es: " +objMateria.getCodigoMateria());
    
        System.out.println("Materia, con parametros");

        Materia objMateria2=new Materia("Biologia",001);

        System.out.println("El Nombre de la materia es: " +objMateria2.getNombreMateria());
        System.out.println("El codigo de la materia es: " +objMateria2.getCodigoMateria());

        //Foro

        System.out.println("Foro, sin parametros");

        Foro objForo=new Foro();

        objForo.setNombreForo("Dudas e inquietudes");
 
        System.out.println("El Nombre de la materia es: " +objForo.getNombreForo());

        System.out.println("Foro, con parametros");

        Foro objForo2=new Foro("Dudas e inquietudes");

        System.out.println("El Nombre de la materia es: " +objForo2.getNombreForo());




       









    }

}
