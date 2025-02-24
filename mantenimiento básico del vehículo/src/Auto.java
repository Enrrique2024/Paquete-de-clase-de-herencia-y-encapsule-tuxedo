class Automovil extends Vehiculo {
    int nivelDeAceite;
    int presionDeNeumaticos;

    public Automovil(String marca, String modelo) {
        super(marca, modelo);
        this.nivelDeAceite = 100;
        this.presionDeNeumaticos = 30;
    }

    @Override
    public double realizarMantenimiento(double costoPorKilometro, int kilometrosRecorridos) {
        double costoTotal = super.realizarMantenimiento(costoPorKilometro, kilometrosRecorridos);
        System.out.println("Realizando mantenimiento  del auto");
        return costoTotal;
    }

    public double calcularCostoMantenimiento(double costoPorKilometro, int kilometrosRecorridos) {
        // Programación estructurada para calcular el costo de mantenimiento del automóvil
        return costoPorKilometro * kilometrosRecorridos;
    }
}

    