public class PanelSolar extends Equipo implements Registrable, Medible {
    // Atributos especiales de la clase
    private double area;
    private double eficiencia;

    // Constructor
    public PanelSolar(int id, String nombre, double consumoElectrico, String fabricante, double area, double eficiencia) {
        super(id, nombre, consumoElectrico, fabricante);
        this.area = area;
        this.eficiencia = eficiencia;
    }

    // Polimorfismo de los métodos de las interfaces
    @Override
    public String registrar() {
        return "Panel Solar " + nombre + " registrado";
    }

    @Override
    public String desregistrar() {
        return "Panel Solar " + nombre + " desregistrado";
    }

    @Override
    public double medirConsumo() {
        return area * (eficiencia / 100) * 100;
    }

    @Override
    public boolean esMedible() {
        return true;
    }
    
}
