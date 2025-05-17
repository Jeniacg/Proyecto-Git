



public class Profesor {
    private String CodProfesor;
    private String NombreProfesor;
    private String CedulaProfesor;
    private String TelefonoProfesor;
    private String CorreoProfesor;
    private String FechaNacimientoProfesor;
    private String DireccionProfesor;
    private String CiudadProfesor;


    public Profesor(){

    }

    public Profesor(String CodProfesor, String NombreProfesor, String CedulaProfesor, String TelefonoProfesor, 
    String CorreoProfesor, String FechaNacimientoProfesor, String DireccionProfesor, String CiudadProfesor)
    {
        this.CodProfesor=CodProfesor;
        this.NombreProfesor=NombreProfesor;
        this.CedulaProfesor=CedulaProfesor;
        this.TelefonoProfesor=TelefonoProfesor;
        this.CorreoProfesor=CorreoProfesor;
        this.FechaNacimientoProfesor=FechaNacimientoProfesor;
        this.DireccionProfesor=DireccionProfesor;
        this.CiudadProfesor=CiudadProfesor;
    }

    public String getCodProfesor() {
        return CodProfesor;
    }

    public void setCodProfesor(String CodProfesor) {
        this.CodProfesor = CodProfesor;
    }

    public String getNombreProfesor() {
        return NombreProfesor;
    }

    public void setNombreProfesor(String NombreProfesor) {
        this.NombreProfesor = NombreProfesor;
    }

    public String getCedulaProfesor() {
        return CedulaProfesor;
    }

    public void setCedulaProfesor(String CedulaProfesor) {
        this.CedulaProfesor = CedulaProfesor;
    }

    public String getTelefonoProfesor() {
        return TelefonoProfesor;
    }

    public void setTelefonoProfesor(String TelefonoProfesor) {
        this.TelefonoProfesor = TelefonoProfesor;
    }

    public String getCorreoProfesor() {
        return CorreoProfesor;
    }

    public void setCorreoProfesor(String CorreoProfesor) {
        this.CorreoProfesor = CorreoProfesor;
    }

    public String getFechaNacimientoProfesor() {
        return FechaNacimientoProfesor;
    }

    public void setFechaNacimientoProfesor(String FechaNacimientoProfesor) {
        this.FechaNacimientoProfesor = FechaNacimientoProfesor;
    }

    public String getDireccionProfesor() {
        return DireccionProfesor;
    }

    public void setDireccionProfesor(String DireccionProfesor) {
        this.DireccionProfesor = DireccionProfesor;
    }

    public String getCiudadProfesor() {
        return CiudadProfesor;
    }

    public void setCiudadProfesor(String CiudadProfesor) {
        this.CiudadProfesor = CiudadProfesor;
    }



}
