
/**
 * Write a description of class DocentesCatedra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DocenteCatedra extends Docente {
    private String categoria;
    private int horasCatedra;

    public DocenteCatedra(String nombre, String contrato, String nivelEstudio, int codigo, int telefono, int numeroArticulos, int numeroLibrosEscritos){
        super(nombre, contrato, codigo, telefono, numeroArticulos, numeroLibrosEscritos);
        this.categoria = categoria;
        this.horasCatedra = horasCatedra;
    }

    @Override
    public double calcularSalarioMensual(double smmlv) {
        double salarioPorHora = 0.0;
        switch (categoria) {
            case "auxiliar":
                salarioPorHora = 40000;
                break;
            case "asistente":
                salarioPorHora = 45000;
                break;
            case "asociado":
                salarioPorHora = 50000;
                break;
        }
        return salarioPorHora * horasCatedra;
    }
}

