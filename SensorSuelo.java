public class SensorSuelo extends Equipo implements Registrable, Medible {
    private double areaCubierta;
    private double consumoPorMetroCuadrado;

    public SensorSuelo(int id, String nombre, double consumoElectrico, String fabricante, double areaCubierta, double consumoPorMetroCuadrado) {
        super(id, nombre, consumoElectrico, fabricante);
        this.areaCubierta = areaCubierta;
        this.consumoPorMetroCuadrado = consumoPorMetroCuadrado;
    }

    @Override
    public String registrar() {
        return "Sensor de Suelo " + nombre + " registrado";
    }

    @Override
    public String desregistrar() {
        return "Sensor de Suelo " + nombre + " desregistrado";
    }

    @Override
    public double medirConsumo() {
        return areaCubierta * consumoPorMetroCuadrado;
    }

    @Override
    public boolean esMedible() {
        return true;
    }
    
}
