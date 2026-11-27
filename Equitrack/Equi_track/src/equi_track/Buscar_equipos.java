/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package equi_track;

import java.util.ArrayList;
import java.util.Scanner;

public class Buscar_equipos {

    public static void buscar(ArrayList<String[]> equipos, Scanner Scan) {

        System.out.print("Ingrese el codigo del equipo: ");
        String codigo = Scan.nextLine();

        boolean encontrado = false;

        for (String[] equipo : equipos) {

            if (equipo[0].equalsIgnoreCase(codigo)) {

                System.out.println("Equipo encontrado:");
                System.out.println("Codigo: " + equipo[0]);
                System.out.println("Nombre: " + equipo[1]);
                System.out.println("Categoria: " + equipo[2]);
                System.out.println("Disponibilidad: " + equipo[3]);
                System.out.println("Prestado a: " + equipo[4]);

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro el equipo.");
        }
    }
}

