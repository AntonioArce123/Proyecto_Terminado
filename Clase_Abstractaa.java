package Proyecto_Terminado;

import java.util.Scanner;

public abstract class Clase_Abstractaa {
    String numero_cuenta;
    protected int transacciones, retiro, deposito, transferencia;
    private static int saldo;
    protected Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        String Nombre = "";
        do {
            do {
                System.out.println(" Buenas tardes esta en un cajero automatico de BBVA");
                System.out.println(" Hoy es 31/10/2023");
                System.out.println(" Porfavor seleccione una opción:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Hacer una transferencia");
                System.out.println("    5. Salir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 5) {
                    bandera = 1;
                } else {
                    System.out.println("=================================================");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("=================================================\n");
                }
                
            } while (bandera == 0);

            switch (seleccion) {
                case 1:
                    Clase_Abstractaa mensajeroConsulta = new Consulta();
                    mensajeroConsulta.Transacciones();
                    break;
                case 2:
                    Clase_Abstractaa mensajeroRetiro = new Retiro();
                    mensajeroRetiro.Transacciones();
                    break;
                case 3:
                    Clase_Abstractaa mensajeroDeposito = new Deposito();
                    mensajeroDeposito.Transacciones();
                    break;
                case 4:
                    Clase_Abstractaa mensajeroTransferencia = new Transferencia();
                    mensajeroTransferencia.Transacciones();
                    break;
                case 5:
                    System.out.println("==========================");
                    System.out.println("Gracias, vuelva pronto.");
                    System.out.println("==========================");
                    bandera = 2;
                    break;
            }

        } while (bandera != 2);
    }

    public void Numero_cuenta() {
        numero_cuenta = entrada.nextLine();
    }

    public void Retiro() {
        retiro = entrada.nextInt();
    }

    public void Deposito() {
        deposito = entrada.nextInt();
    }

    public void Transferencia() {
        transferencia = entrada.nextInt();
    }

    public abstract void Transacciones();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
