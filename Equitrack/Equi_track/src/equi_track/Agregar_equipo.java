/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equi_track;

import java.util.ArrayList;
import java.util.Scanner;

public class Agregar_equipo {

    public static void agregar(ArrayList<String[]> equipos, Scanner Scan) {
        Scan.nextLine();
        System.out.print("Ingrese el codigo del equipo: ");
        String codigo = Scan.nextLine();

        if (codigo.trim().isEmpty()) {
            System.out.println("El codigo no puede quedar vacio.");
            return;
        }

        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i)[0].equalsIgnoreCase(codigo)) {
                System.out.println("Ese codigo ya existe.");
                return;
            }
        }

        System.out.print("Ingrese el nombre del equipo: ");
        String nombre = Scan.nextLine();
        System.out.print("Ingrese la categoria: ");
        String categoria = Scan.nextLine();

        if (nombre.trim().isEmpty() || categoria.trim().isEmpty()) {
            System.out.println("El nombre y la categoria son obligatorios.");
            return;
        }

        String[] nuevo = {codigo, nombre, categoria, "Disponible", "", ""};
        equipos.add(nuevo);
        System.out.println("Equipo agregado correctamente.");
    }
}
