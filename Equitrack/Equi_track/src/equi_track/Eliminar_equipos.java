/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equi_track;

import java.util.ArrayList;
import java.util.Scanner;

public class Eliminar_equipos {

    public static void eliminar(ArrayList<String[]> equipos, Scanner Scan) {
        Scan.nextLine();
        System.out.print("Ingrese el codigo del equipo a eliminar: ");
        String codigo = Scan.nextLine();

        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i)[0].equalsIgnoreCase(codigo)) {
                System.out.print("Esta seguro que desea eliminar " + equipos.get(i)[1] + "? (S/N): ");
                String resp = Scan.nextLine();

                if (resp.equalsIgnoreCase("S")) {
                    equipos.remove(i);
                    System.out.println("Equipo eliminado.");
                } else {
                    System.out.println("Operacion cancelada.");
                }
                return;
            }
        }

        System.out.println("No se encontro un equipo con ese codigo.");
    }
}
