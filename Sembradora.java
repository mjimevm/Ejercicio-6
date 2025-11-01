public class Sembradora extends Equipo implements Registrable, Medible, Accionable {
    // Constructor
    public Sembradora(int id, String nombre, double consumoElectrico, String fabricante) {
        super(id, nombre, consumoElectrico, fabricante);
    }

    // Polimorfismo de los métodos de las interfaces
    @Override
    public String registrar() {
        return "Sembradora " + nombre + " registrada.";
    }

    // Polimorfismo de los métodos de las interfaces
    @Override
    public String desregistrar() {
        return "Sembradora " + nombre + " desregistrada.";
    }

    @Override
    public double medirConsumo() {
        return consumoElectrico;
    }

    @Override
    public boolean esMedible() {
        return true;
    }

    @Override
    public String activar() {
        return "Sembradora " + nombre + " activada.";
    }

    @Override
    public String desactivar() {
        return "Sembradora " + nombre + " desactivada.";
    }
}
