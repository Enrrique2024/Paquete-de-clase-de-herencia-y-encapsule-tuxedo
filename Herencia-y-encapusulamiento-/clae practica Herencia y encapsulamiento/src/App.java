public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Sistema de papucarro");

        //Crear instancias de cada tipo de vehiculo
        
        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 2000, 4);

        //Mostrar la informacion de cada vehiculo
        
        System.out.println("Informacion del Auto");
        auto.mostrarInfo();

        System.out.println("Informacion del Camion");
        camion.mostrarInfo();
    }
}