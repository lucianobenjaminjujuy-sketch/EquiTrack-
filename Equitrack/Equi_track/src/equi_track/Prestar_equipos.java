/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package equi_track;

import java.util.ArrayList;
import java.util.Scanner;

public class Prestar_equipos {

    public static void prestar(ArrayList<String[]> equipos, Scanner Scan) {

        System.out.print("Ingrese el codigo del equipo: ");
        String codigo = Scan.nextLine();

        boolean encontrado = false;

        for (String[] equipo : equipos) {

            if (equipo[0].equalsIgnoreCase(codigo)) {

                encontrado = true;

                if (equipo[3].equals("Disponible")) {

                    System.out.print("Ingrese el nombre de quien recibe: ");
                    String persona = Scan.nextLine();

                    equipo[3] = "Prestado";
                    equipo[4] = persona;

                    System.out.println("Prestamo realizado correctamente.");

                } else {
                    System.out.println("El equipo ya esta prestado.");
                }

                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro el equipo.");
        }
    }
}

