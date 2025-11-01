import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        Controlador controlador = new Controlador();
        // Bucle hasta 4
        while (opcion !=4) {
            // Mostrar menú de opciones
            System.out.println("\nMenú de opciones: ");
            System.out.println("1. Lista de todos los equipos");
            System.out.println("2. Buscar equipo por ID o nombre");
            System.out.println("3. Ordenar catálogo por consumo eléctrico");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1: 
                    System.out.println("\nLista de todos los equipos");
                        for (Equipo equipo : controlador.getCatalogo()) {
                            System.out.println(equipo);
                    }
                    break;
                // Opción 2: Buscar los equipos por ID    
                case 2:
                    System.out.println("\nBúsqueda de Equipos: ");
                    System.out.print("¿Desea buscar por (1) ID o (2) Nombre? ");
                    int opcionBusqueda = teclado.nextInt();
                    if (opcionBusqueda == 2) {
                        System.out.println("Indique el nombre del dispositivo que quiere encontrar: ");
                        teclado.nextLine(); // Consumir el salto de línea pendiente
                        String nombre = teclado.nextLine();
                        System.out.println(controlador.buscarPorNombre(nombre));
                        break;
                    }
                    System.out.print("Indique el ID del dispositivo que quiere encontrar: ");
                    int id = teclado.nextInt();
                    System.out.println(controlador.buscarPorId(id));
                    break;
                case 3: 
                    System.out.println("\nOrdenar catálogo por consumo eléctrico: ");
                    controlador.ordenarPorConsumo();
                    break;
                case 4: 
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
