public class Bomba extends Equipo implements Registrable, Accionable {
    public Bomba(int id, String nombre, double consumoElectrico, String fabricante) {
        super(id, nombre, consumoElectrico, fabricante);
    }

    @Override
    public String registrar() {
        return "Bomba " + nombre + " registrada";
    }

    @Override
    public String desregistrar() {
        return "Bomba " + nombre + " desregistrada";
    }

    @Override
    public String activar() {
        return "Bomba " + nombre + " activada";
    }

    @Override
    public String desactivar() {
        return "Bomba " + nombre + " desactivada";
    }
    
}
