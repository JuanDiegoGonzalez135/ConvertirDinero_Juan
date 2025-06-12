package covertir_dinero;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Covertir_Dinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("¿Que quieres hacer?");
            System.out.println("1) Pesos mexicanos a dólares");
            System.out.println("2) Pesos mexicanos a euros");
            System.out.println("3) Dólares a pesos");
            System.out.println("4) Euros a pesos");
            System.out.println("5) Salir");
            opc=sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("---CONVERTIR PESOS A DOLARES---");
                    System.out.println("Cual es la cantidad de pesos que tienes?");
                     double cantP= sc.nextDouble();
                     double totalD=(cantP/17.5);
                     System.out.println("La cantidad de dolares es de: "+totalD);
                    break;
                case 2:
                    System.out.println("---CONVERTIR DE PESOS A EUROS---");
                    System.out.println("Cual es la cantidad de pesos que tienes?");
                     double cantPE= sc.nextDouble();
                     double totalE=(cantPE/19.2);
                     System.out.println("La cantidad de euros es de: "+totalE);
                    break;
                case 3:
                    System.out.println("---CONVERTIR DE DOLARES A PESOS---");
                    System.out.println("Cual es la cantidad de dolares que tienes?");
                     double cantDP= sc.nextDouble();
                     double totalP=(cantDP*17.5);
                     System.out.println("La cantidad de Pesos es de: "+totalP);
                    break;
                case 4:
                    System.out.println("---CONVERTIR DE EUROS A PESOS---");
                    System.out.println("Cual es la cantidad de pesos que tienes?");
                     double cantEP= sc.nextDouble();
                     double totalEP=(cantEP*19.2);
                     System.out.println("La cantidad de Pesos es de:  "+totalEP);
                    break;
                default:
                    System.out.println("Opcion no valida intente intenta otra vez...");
            }
        } while (opc != 5);
    }

}
