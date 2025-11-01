public abstract class Equipo implements Comparable<Equipo> {
    // Atributos comunes a todos los equipos
    protected int id;
    protected String nombre;
    protected double consumoElectrico;
    protected String fabricante;

    // Constructor
    public Equipo(int id, String nombre, double consumoElectrico, String fabricante) {
        this.id = id;
        this.nombre = nombre;
        this.consumoElectrico = consumoElectrico;
        this.fabricante = fabricante;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getConsumoElectrico() {
        return consumoElectrico;
    }
    // Polimorfismo del método toString
    @Override
    public String toString() {
        return "Equipo [ID: " + id + "] Nombre: " + nombre + " {Consumo Eléctrico: " + consumoElectrico + "}, Fabricante: " + fabricante;
    }

    // Implementación del método compareTo para ordenar por consumo eléctrico
    @Override
    public int compareTo(Equipo otro) {
        return Double.compare(this.consumoElectrico, otro.consumoElectrico);
    }
}
