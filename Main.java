package Proyecto_Terminado;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        boolean datosCorrectos = false;

        while (!datosCorrectos) {
            System.out.println("----------------------------------------------------");
            System.out.println("Ingrese su Nombre: (Catalina)");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su Numero de cuenta: (23140972)");
            String numCuenta = entrada.nextLine();
            System.out.println("Ingrese su Nip: (8002)");
            int nip = entrada.nextInt();
            entrada.nextLine(); // Consumir la nueva línea pendiente
            System.out.println("----------------------------------------------------");

            if (nombre.equals("Catalina") && numCuenta.equals("23140972") && nip == 8002) {
                datosCorrectos = true;
                System.out.println("===============================================");
                System.out.print(nombre);
                Clase_Abstractaa mensajero = new Consulta();
                mensajero.setSaldo(1700);
                mensajero.Operaciones();
            } else {
                System.out.println("===============================================");
                System.out.println("Alguno de sus datos es erroneo, intente de nuevo");
                System.out.println("===============================================");
            }
        }
    }
    

    public String getNombre() {
        return getNombre();
    }
}
