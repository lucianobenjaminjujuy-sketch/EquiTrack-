package equi_track;

import java.util.Scanner;
import java.util.ArrayList;
public class Equi_Track {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 1;
        String wait=null;
        Scanner Scan = new Scanner(System.in);
        Scanner Espera = new Scanner(System.in);
ArrayList<String[]> equipos = new ArrayList<String[]>();

        do{
        
        System.out.println("========EQUITRACK========");
        System.out.println("1. Agregar equipo");
        System.out.println("2. Listar equipo");
        System.out.println("3. Buscar equipos");
        System.out.println("4. Prestar equipo");
        System.out.println("5. Devolver equipo");
        System.out.println("6. Modificar equipo");
        System.out.println("7. Eliminar equipo");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opcion para continuar: ");
        opcion = Scan.nextInt();
        
        switch(opcion){
            case 1:
                System.out.print("Pulse cualquier tecla para continuar: ");
                //Aca va el nombre del metodo en el que programaron la accion
                Agregar_equipo.agregar(equipos, Scan);
                wait=Espera.nextLine();
                break;
            case 2:
                System.out.print("Pulse cualquier tecla para continuar: ");
                 //Aca va el nombre del metodo en el que programaron la accion
               Listar_equipo.listar(equipos);
                wait=Espera.nextLine();
                break;
            case 3:
                System.out.print("Pulse cualquier tecla para continuar: ");
                 //Aca va el nombre del metodo en el que programaron la accion
                  Buscar_equipos.buscar(equipos, Scan);
                wait=Espera.nextLine();
                break;                        
            case 4:
                System.out.print("Pulse cualquier tecla para continuar: ");
                 //Aca va el nombre del metodo en el que programaron la accion
                 Prestar_equipos.prestar(equipos, Scan);
                wait=Espera.nextLine();
                break;
            case 5:
                System.out.print("Pulse cualquier tecla para continuar: ");
                 //Aca va el nombre del metodo en el que programaron la accion
                 Devolver_equipos.devolver(equipos, Scan);
                 wait=Espera.nextLine();
                break;
            case 6:
                System.out.print("Pulse cualquier tecla para continuar: ");
                 //Aca va el nombre del metodo en el que programaron la accion
                 wait=Espera.nextLine();
                break;
            case 7:
                System.out.print("Pulse cualquier tecla para continuar: ");
                 //Aca va el nombre del metodo en el que programaron la accion
                Eliminar_equipos.eliminar(equipos, Scan);
                wait=Espera.nextLine();
                break;
            case 0:
                System.out.println("saliendo...");
                System.out.print("Pulse cualquier tecla para continuar: ");
                wait=Espera.nextLine();
                break;
            default:    
                System.out.println("ERROR: Opcion no encontrada");
                System.out.print("Pulse cualquier tecla para continuar: ");
                 wait=Espera.nextLine();
            break;
        }
        opcion = Scan.nextInt();
        Scan.nextLine();
        System.out.println("=========================");
        
        }while(opcion!=0);
        
        System.exit(0);
    }
    
}
