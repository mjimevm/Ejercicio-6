public class Valvula extends Equipo implements Registrable, Accionable {
    
    // Constructor
    public Valvula(int id, String nombre, double consumoElectrico, String fabricante) {
        super(id, nombre, consumoElectrico, fabricante);
    }

    // Polimorfismo de los métodos de las interfaces
    @Override
    public String registrar() {
        return "Válvula " + nombre + " registrada";
    }

    @Override
    public String desregistrar() {
        return "Válvula " + nombre + " desregistrada";
    }

    @Override
    public String activar() {
        return "Válvula " + nombre + " activada";
    }

    @Override
    public String desactivar() {
        return "Válvula " + nombre + " desactivada";
    }
}
