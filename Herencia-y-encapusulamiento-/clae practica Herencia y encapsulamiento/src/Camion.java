public class Camion extends VehiculoCarga{
    private int numEjes;

//Consutructor
    public Camion(String marca, String modelo, int año, int kilometraje, int cantidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje);
        this.numEjes = numEjes;
        
    }
    //Getters y Setters
    public int getNumEjes() {
        return numEjes;
    }
    
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
    //Sobreescribir el metodo mostrarInfo()
@Override
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Numero de ejes: "+numEjes);
    } 
}
