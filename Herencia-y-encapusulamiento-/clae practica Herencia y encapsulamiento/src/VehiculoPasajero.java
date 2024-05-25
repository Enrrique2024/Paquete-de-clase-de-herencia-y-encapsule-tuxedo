public class VehiculoPasajero extends Vehiculo{

    private int numPasajeros;

    public VehiculoPasajero(String marca, String modelo, String año, int kilometraje) {
        super(marca, modelo, año, kilometraje);
        
    }

    public int getNumPasajeros(int numPasajeros){
        return numPasajeros;
}
public void setNumPasajeros(int numPasajeros){
    this.numPasajeros = numPasajeros;
}
@Override
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Numero de pasajeros: " + numPasajeros);
    }
}