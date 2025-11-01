public class Sembradora extends Equipo implements Registrable, Medible, Accionable {
    public Sembradora(int id, String nombre, double consumoElectrico, String fabricante) {
        super(id, nombre, consumoElectrico, fabricante);
    }

    @Override
    public String registrar() {
        return "Sembradora " + nombre + " registrada.";
    }

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
