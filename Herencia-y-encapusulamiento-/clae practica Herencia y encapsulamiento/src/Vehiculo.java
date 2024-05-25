public class Vehiculo {
    private String marca;
    private String modelo;
    private String año;
    private int kilometraje;


public Vehiculo(String marca, String modelo, String año, int kilometraje){ 
    this.marca = marca;
    this.modelo = modelo;
    this.año = año;
    this.kilometraje = kilometraje;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getKilometraje() {
        return kilometraje;
        
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void mostrarInfo(){ 
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Kilometraje: " + kilometraje);
    }
}