
/**
 * Write a description of class DocentesOcasionales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DocenteOcasional extends Docente
{
    private String nivelEstudio;

    public DocenteOcasional(String nombre, String contrato, String nivelEstudio, int codigo, int telefono, int numeroArticulos, int numeroLibrosEscritos){
        super(nombre, contrato, codigo, telefono, numeroArticulos, numeroLibrosEscritos);
        this.nivelEstudio = nivelEstudio;
    }

    @Override
    public double calcularSalarioMensual(double smmlv){
        double salarioBase = 0.0;
        switch (nivelEstudio) {
            case "especializacion":
                salarioBase = 3 * smmlv;
                break;
            case "maestria":
                salarioBase = 4 * smmlv;
                break;
            case "doctorado":
                salarioBase = 5 * smmlv;
                break;
        }
        return salarioBase;
    }
}
