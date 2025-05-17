public class Materia {
    private String NombreMateria;
    private int CodigoMateria;
    
    public Materia()
    {

    }

    public Materia(String NombreMateria, int CodigoMateria)
    {
        this.NombreMateria=NombreMateria;
        this.CodigoMateria=CodigoMateria;
    }

    public String getNombreMateria() {
        return NombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        NombreMateria = nombreMateria;
    }

    public int getCodigoMateria() {
        return CodigoMateria;
    }

    public void setCodigoMateria(int codigoMateria) {
        CodigoMateria = codigoMateria;
    }

    
}
