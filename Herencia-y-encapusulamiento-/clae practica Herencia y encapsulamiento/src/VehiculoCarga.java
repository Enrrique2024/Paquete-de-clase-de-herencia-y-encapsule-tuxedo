public class VehiculoCarga extends Vehiculo{
    private int capacidadCarga;

//Constructor
    public VehiculoCarga(String marca, String modelo, String año, int kilometraje) {
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

//Getter y Setter para capacidadCarga
public int getCapacidadCarga() {
        return capacidadCarga;

}

 public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;

 }

 //Sobreescribir el metodo mostrarInfo()
@Override
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Capacidad de carga: " + capacidadCarga);
    
    }
}
