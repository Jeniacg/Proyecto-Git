

public class Estudiante {
    private String CodEstudiante;
    private String NombreEstudiante;
    private String CedulaEstudiante;
    private String TelefonoEstudiante;
    private String CorreoEstudiante;
    private String FechaNacimientoEStudiante;
    private String DireccionEstudiante;
    private String CiudadEstudiante;
    
    public Estudiante()
    {

    }

    public Estudiante(String CodEstudiante, String NombreEstudiante, String CedulaEstudiante, String TelefonoEstudiante,String CorreoEstudiante,
    String FechaNacimientoEStudiante, String DireccionEstudiante,String CiudadEstudiante)
    {
        this.CodEstudiante=CodEstudiante;
        this.NombreEstudiante=NombreEstudiante;
        this.CedulaEstudiante=CedulaEstudiante;
        this.TelefonoEstudiante=TelefonoEstudiante;
        this.CorreoEstudiante=CorreoEstudiante;
        this.FechaNacimientoEStudiante=FechaNacimientoEStudiante;
        this.DireccionEstudiante=DireccionEstudiante;
        this.CiudadEstudiante=CiudadEstudiante;

    }

    public String getCodEstudiante() {
        return CodEstudiante;
    }

    public void setCodEstudiante(String codEstudiante) {
        CodEstudiante = codEstudiante;
    }

    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        NombreEstudiante = nombreEstudiante;
    }

    public String getCedulaEstudiante() {
        return CedulaEstudiante;
    }

    public void setCedulaEstudiante(String cedulaEstudiante) {
        CedulaEstudiante = cedulaEstudiante;
    }

    public String getTelefonoEstudiante() {
        return TelefonoEstudiante;
    }

    public void setTelefonoEstudiante(String telefonoEstudiante) {
        TelefonoEstudiante = telefonoEstudiante;
    }

    public String getCorreoEstudiante() {
        return CorreoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        CorreoEstudiante = correoEstudiante;
    }

    public String getFechaNacimientoEStudiante() {
        return FechaNacimientoEStudiante;
    }

    public void setFechaNacimientoEStudiante(String fechaNacimientoEStudiante) {
        FechaNacimientoEStudiante = fechaNacimientoEStudiante;
    }

    public String getDireccionEstudiante() {
        return DireccionEstudiante;
    }

    public void setDireccionEstudiante(String direccionEstudiante) {
        DireccionEstudiante = direccionEstudiante;
    }

    public String getCiudadEstudiante() {
        return CiudadEstudiante;
    }

    public void setCiudadEstudiante(String ciudadEstudiante) {
        CiudadEstudiante = ciudadEstudiante;
    }

    
}
