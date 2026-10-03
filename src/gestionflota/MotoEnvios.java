package gestionflota;

public class MotoEnvios extends Vehiculo {

    public MotoEnvios(String patente, String marca, double costoBaseKm) {
        super(patente, marca, costoBaseKm);
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return (distanciaKm * this.costoBaseKm) * 0.85;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("[Vehículo] MotoEnvios | Patente: " + patente + " | Marca: " + marca + " | Mensajería liviana");
    }
}