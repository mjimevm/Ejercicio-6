public class Cosechadora extends Equipo implements Registrable, Accionable {
    public Cosechadora(int id, String nombre, double consumoElectrico, String fabricante) {
        super(id, nombre, consumoElectrico, fabricante);
    }

    @Override
    public String registrar() {
        return "Cosechadora " + nombre + " registrada";
    }

    @Override
    public String desregistrar() {
        return "Cosechadora " + nombre + " desregistrada";
    }

    @Override
    public String activar() {
        return "Cosechadora " + nombre + " activada";
    }

    @Override
    public String desactivar() {
        return "Cosechadora " + nombre + " desactivada";
    }
    
}
