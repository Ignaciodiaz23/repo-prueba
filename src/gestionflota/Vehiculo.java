package gestionflota;

public class Vehiculo {
    protected String patente;
    protected String marca;
    protected double costoBaseKm;

    public Vehiculo(String patente, String marca, double costoBaseKm) {
        this.patente = patente;
        this.marca = marca;
        this.costoBaseKm = costoBaseKm;
    }

    public double calcularCostoViaje(double distanciaKm) {
        return distanciaKm * this.costoBaseKm;
    }

    // Sobrecarga de método que contempla peajes
    public double calcularCostoViaje(double distanciaKm, double peajes) {
        return calcularCostoViaje(distanciaKm) + peajes;
    }

    public void mostrarFicha() {
        System.out.print("[Vehículo] Patente: " + patente + " | Marca: " + marca);
    }
}
