public class Aspersor extends Equipo implements Registrable, Accionable, Medible {
    private double areaCubierta;
    private double consumoPorMetroCuadrado;

    public Aspersor(int id, String nombre, double consumoElectrico, String fabricante, double areaCubierta, double consumoPorMetroCuadrado) {
        super(id, nombre, consumoElectrico, fabricante);
        this.areaCubierta = areaCubierta;
        this.consumoPorMetroCuadrado = consumoPorMetroCuadrado;
    }

    @Override
    public String registrar() {
        return "Aspersor " + nombre + " registrado";
    }

    @Override
    public String desregistrar() {
        return "Aspersor " + nombre + " desregistrado";
    }

    @Override
    public String activar() {
        return "Aspersor " + nombre + " activado";
    }

    @Override
    public String desactivar() {
        return "Aspersor " + nombre + " desactivado";
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
