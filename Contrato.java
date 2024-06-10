
/**
 * Write a description of class Contrato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Contrato
{
    
    private int salarioCatedraAuxiliar=40000;
    private int salarioCatedraAsistente=45000;
    private int salarioCatedraAsociado=50000;
    
    private int salarioOcasionalExpecializacion=3900000;
    private int salarioOcasionalMaestria=5200000;
    private int salarioOcasionalDoctorado=6500000;

    public Contrato(int salarioCatedraAuxiliar, int salarioCatedraAsistente, int salarioCatedraAsociado){
        this.salarioCatedraAuxiliar = salarioCatedraAuxiliar;
        this.salarioCatedraAsistente = salarioCatedraAsistente;
        this.salarioCatedraAsociado = salarioCatedraAsociado;
        
        this.salarioOcasionalExpecializacion = salarioOcasionalExpecializacion;
        this.salarioOcasionalMaestria = salarioOcasionalMaestria;
        this.salarioOcasionalDoctorado = salarioOcasionalDoctorado;
        
    }

    
}
