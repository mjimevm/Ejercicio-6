public class Tractor extends Equipo implements Registrable, Accionable, Medible {
    // Coonstructor
    public Tractor(int id, String nombre, double consumoElectrico, String fabricante) {
        super(id, nombre, consumoElectrico, fabricante);
    }

    //Polimorfismo de interfaces
    @Override
    public String registrar() {
        return "Tractor " + nombre + " registrado.";
    }

    @Override
    public String desregistrar() {
        return "Tractor " + nombre + " desregistrado.";
    }

    @Override
    public String activar() {
        return "Tractor " + nombre + " activado.";
    }

    @Override
    public String desactivar() {
        return "Tractor " + nombre + " desactivado.";
    }

    @Override
    public double medirConsumo() {
        return consumoElectrico;
    }

    @Override
    public boolean esMedible() {
        return true;
    }
    
}
