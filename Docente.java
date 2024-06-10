
/**
 * Write a description of class Docente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docente{
    //Atributos
    public String nombre;
    private String contrato;
    private int codigo;
    private int telefono;
    private int numeroArticulos;
    private int numeroLibrosEscritos;
    
    //Constructor
    public Docente(String nombre, String contrato, int telefono, int codigo, int numeroArticulos, int numeroLibrosEscritos){
        this.nombre = nombre;
        this.contrato = contrato;
        this.telefono = telefono;
        this.codigo = codigo;
        this.numeroArticulos = numeroArticulos;
        this.numeroLibrosEscritos = numeroLibrosEscritos;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getContrato(){
        return contrato;
    }
    public int getTelefono(){
        return telefono;
    }
    public int getCodigo(){
        return codigo;
    }
    public int getNumeroArticulos(){
        return numeroArticulos;
    }
    public int getNumeroLibrosEscritos(){
        return numeroLibrosEscritos;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setContrato(String contrato){
        this.contrato = contrato;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setnumeroArticulos(int numeroArticulos){
        this.numeroArticulos = numeroArticulos;
    }
    public void setNumeroLibrosEscritos(int numeroLibrosEscritos){
        this.numeroLibrosEscritos = numeroLibrosEscritos;
    }

    public void validarPublicaciones(int numeroArticulos, int numeroLibrosEscritos){
        this.numeroArticulos += numeroArticulos;
        this.numeroLibrosEscritos += numeroLibrosEscritos;
    }

    public String mostrarPublicaciones(){
        return "El docente " + nombre + " ha publicado " + numeroArticulos + " artículo(s) y " + numeroLibrosEscritos + " libro(s).";
    }

    public void setcargoAdministrativo(String contrato){
        this.contrato = contrato;
    }

    public String getcargoAdministrativo(){
        return contrato;
    }

    public double calcularSalarioMensual(double smmlv){
        return 0.0;
    }
    
    
    public static void main(String[] args) {
        double smmlv = 1000000;

        DocenteTiempoCompleto docenteTC = new DocenteTiempoCompleto("Juan", "TC", "asociado", 18, 322, 1, 0);
        docenteTC.validarProductoInvestigacion("articulo");
        docenteTC.validarProductoInvestigacion("libro");

        DocenteOcasional docenteOcasional = new DocenteOcasional("María", "Ocasional", "maestria", 19, 324, 1, 0);

        DocenteCatedra docenteCatedra = new DocenteCatedra("Carlos", "Catedra", "asistente", 20, 325, 1, 0);

        // Mostrar salarios mensuales
        System.out.println("Salario mensual de " + docenteTC.nombre + ": $" + docenteTC.calcularSalarioMensual(smmlv));
        System.out.println("Salario mensual de " + docenteOcasional.nombre + ": $" + docenteOcasional.calcularSalarioMensual(smmlv));
        System.out.println("Salario mensual de " + docenteCatedra.nombre + ": $" + docenteCatedra.calcularSalarioMensual(smmlv));

        // Mostrar publicaciones
        System.out.println(docenteTC.mostrarPublicaciones());
    }
        
}
