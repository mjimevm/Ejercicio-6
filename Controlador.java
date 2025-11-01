import java.util.ArrayList;
import java.util.Collections;
public class Controlador {
    // Catálogo de equipos
    private ArrayList<Equipo> catalogo;

    // Agregar equipos al catálogo
    public Controlador() {
        catalogo = new ArrayList<>();
        catalogo.add(new Dron(1, "Dron-1", 200, "NewTech")); // 1
        catalogo.add(new Tractor(2, "Tractor Eléctrico de Campo-1", 1500, "NanoFarm S.A.")); // 2
        catalogo.add(new SensorSuelo(3, "Sensor de Suelo-1", 50, "AgroSensors Inc.", 100, 0.5)); // 3
        catalogo.add(new SistemaRiego(4, "Sistema de Riego-1", 300, "IrrigaPlus", 200, 0.8)); // 4
        catalogo.add(new PanelSolar(5, "Panel Solar-1", 0, "EcoEnergy", 20, 15)); // 5
        catalogo.add(new Aspersor(6, "Aspersor-1", 100, "AgroIrriga", 150, 0.5)); // 6
        catalogo.add(new Bomba(7, "Bomba-1", 250, "WaterTech")); // 7
        catalogo.add(new Valvula(8, "Válvula-1", 75, "FlowControl")); // 8
        catalogo.add(new Camara(9, "Cámara-1", 120, "Cams Ltd.")); // 9
        catalogo.add(new Cosechadora(10, "Cosechadora-1", 500, "AgroMachinery")); // 10

    }
    // Devuelve catalogo
    public ArrayList<Equipo> getCatalogo() {
        return catalogo;
    }
    // Buscar equipo por ID
    public String buscarPorId(int id) {
        for (Equipo equipo : catalogo) {
            if (id == equipo.getId()) {
                return equipo.toString();
            }
        }
        return "No se dispone con el equipo con el ID: " + id;
    }
    // Buscar equipo por Nombre
    public String buscarPorNombre(String nombre) {
        for (Equipo equipo : catalogo) {
            if (nombre.equals(equipo.getNombre())) {
                return equipo.toString();
            }
        }
        return "No se dispone con el equipo con el nombre: " + nombre;
    }
    // Ordenar catálogo por consumo eléctrico
    public void ordenarPorConsumo() {
        Collections.sort(catalogo);
    }
    // Método para comparar dos equipos por consumo eléctrico
    public int compararEquipos(Equipo e1, Equipo e2) {
        return e1.compareTo(e2);
    }
}
