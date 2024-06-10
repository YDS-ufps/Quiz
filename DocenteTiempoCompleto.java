
/**
 * Write a description of class DocentesTC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DocenteTiempoCompleto extends Docente{
    private String categoria;
    private int puntosInvestigacion;

    public DocenteTiempoCompleto(String nombre, String contrato, String nivelEstudio, int codigo, int telefono, int numeroArticulos, int numeroLibrosEscritos){
        super(nombre, contrato, codigo, telefono, numeroArticulos, numeroLibrosEscritos);
        this.categoria = categoria;
        this.puntosInvestigacion = 0;
    }
    
    public String getCategoria(){
        return categoria;
    }
    public int getpuntosInvestigacion(){
        return puntosInvestigacion;
    }
    
    public void setNombre(String categoria){
        this.categoria = categoria;
    }
    public void setNombre(int puntosInvestigacion){
        this.puntosInvestigacion = puntosInvestigacion;
    }

    public void validarProductoInvestigacion(String tipoProducto) {
        if (tipoProducto.equals("articulo") || tipoProducto.equals("libro") || tipoProducto.equals("ponencia")) {
            puntosInvestigacion++;
        }
    }

    @Override
    public double calcularSalarioMensual(double smmlv) {
        double salarioBase = 0.0;
        switch (categoria) {
            case "auxiliar":
                salarioBase = 40000;
                break;
            case "asistente":
                salarioBase = 45000;
                break;
            case "asociado":
                salarioBase = 50000;
                break;
        }
        return salarioBase + (puntosInvestigacion * 40000);
    }
}
