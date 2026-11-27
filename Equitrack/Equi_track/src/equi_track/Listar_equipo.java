
package equi_track;

import java.util.ArrayList;

public class Listar_equipo {

    public static void listar(ArrayList<String[]> equipos) {

        System.out.println("===== LISTA DE EQUIPOS =====");

        if (equipos.isEmpty()) {
            System.out.println("No hay equipos registrados.");
        } else {

            for (String[] equipo : equipos) {

                System.out.println("Codigo: " + equipo[0]);
                System.out.println("Nombre: " + equipo[1]);
                System.out.println("Categoria: " + equipo[2]);
                System.out.println("Disponibilidad: " + equipo[3]);
                System.out.println("Prestado a: " + equipo[4]);

                System.out.println("----------------------");
            }
        }
    }
}
