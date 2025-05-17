public class Programa {
    private String NombrePrograma;
    private int CodigoPrograma;
    
    public Programa()
    {

    }

    public Programa(String NombrePrograma, int CodigoPrograma)
    {
        this.NombrePrograma=NombrePrograma;
        this.CodigoPrograma=CodigoPrograma;
    }

    public String getNombrePrograma() {
        return NombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        NombrePrograma = nombrePrograma;
    }

    public int getCodigoPrograma() {
        return CodigoPrograma;
    }

    public void setCodigoPrograma(int codigoPrograma) {
        CodigoPrograma = codigoPrograma;
    }

    
}
