public class SistemaRiego extends Equipo implements Registrable, Accionable, Medible {
    private double areaCubierta;
    private double consumoPorMetroCuadrado;

    public SistemaRiego(int id, String nombre, double consumoElectrico, String fabricante, double areaCubierta, double consumoPorMetroCuadrado) {
        super(id, nombre, consumoElectrico, fabricante);
        this.areaCubierta = areaCubierta;
        this.consumoPorMetroCuadrado = consumoPorMetroCuadrado;
    }

    @Override
    public String registrar() {
        return "Sistema de Riego " + nombre + " registrado";
    }

    @Override
    public String desregistrar() {
        return "Sistema de Riego " + nombre + " desregistrado";
    }

    @Override
    public String activar() {
        return "Sistema de Riego " + nombre + " activado";
    }

    @Override
    public String desactivar() {
        return "Sistema de Riego " + nombre + " desactivado";
    }

    @Override
    public double medirConsumo() {
        return areaCubierta * consumoPorMetroCuadrado;
    }

    @Override
    public boolean esMedible() {
        return true;
    }
    
}
