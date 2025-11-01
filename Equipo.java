public abstract class Equipo implements Comparable<Equipo> {
    protected int id;
    protected String nombre;
    protected double consumoElectrico;
    protected String fabricante;

    public Equipo(int id, String nombre, double consumoElectrico, String fabricante) {
        this.id = id;
        this.nombre = nombre;
        this.consumoElectrico = consumoElectrico;
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getConsumoElectrico() {
        return consumoElectrico;
    }
    @Override
    public String toString() {
        return "Equipo [ID: " + id + "] Nombre: " + nombre + " {Consumo Eléctrico: " + consumoElectrico + "}, Fabricante: " + fabricante;
    }

    @Override
    public int compareTo(Equipo otro) {
        return Double.compare(this.consumoElectrico, otro.consumoElectrico);
    }
}
