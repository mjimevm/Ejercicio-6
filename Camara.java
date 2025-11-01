public class Camara extends Equipo implements Registrable, Accionable {
    // Constructor
    public Camara(int id, String nombre, double consumoElectrico, String fabricante) {
        super(id, nombre, consumoElectrico, fabricante);
    }
    // Polimorfismo de los métodos de las interfaces
    @Override
    public String registrar() {
        return "Cámara " + nombre + " registrada";
    }

    @Override
    public String desregistrar() {
        return "Cámara " + nombre + " desregistrada";
    }

    @Override
    public String activar() {
        return "Cámara " + nombre + " activada";
    }

    @Override
    public String desactivar() {
        return "Cámara " + nombre + " desactivada";
    }
    
}
