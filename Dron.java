public class Dron extends Equipo implements Registrable, Accionable {
    public Dron(int id, String nombre, double consumoElectrico, String fabricante) {
        super(id, nombre, consumoElectrico, fabricante);
    }
    @Override
    public String registrar() {
        return "Dron " + nombre + " registrado";
    }

    @Override
    public String desregistrar() {
        return "Dron " + nombre + " desregistrado";
    }

    @Override
    public String activar() {
        return "Dron " + nombre + " activado";
    }

    @Override
    public String desactivar() {
        return "Dron " + nombre + " desactivado";
    }
}
