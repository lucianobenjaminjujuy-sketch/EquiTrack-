/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package equi_track;

import java.util.ArrayList;
import java.util.Scanner;

public class Devolver_equipos {

    public static void devolver(ArrayList<String[]> equipos, Scanner Scan) {

        System.out.print("Ingrese el codigo del equipo: ");
        String codigo = Scan.nextLine();

        boolean encontrado = false;

        for (String[] equipo : equipos) {

            if (equipo[0].equalsIgnoreCase(codigo)) {

                encontrado = true;

                if (equipo[3].equals("Prestado")) {

                    equipo[3] = "Disponible";
                    equipo[4] = "";

                    System.out.println("Equipo devuelto correctamente.");

                } else {
                    System.out.println("El equipo ya estaba disponible.");
                }

                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro el equipo.");
        }
    }
}

