/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_12_primos;

import java.util.Scanner;

/**
 *
 * @author jozza
 */
public class EVA_1_12_PRIMOS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int n = sc.nextInt();

        // METODO 1 HASTA n - 1

        boolean primo1 = true;

        if (n < 2) {
            primo1 = false;
        } else {

            for (int i = 2; i <= n - 1; i++) {

                if (n % i == 0) {
                    primo1 = false;
                    break;
                }
            }
        }

        
        // METODO 2 HASTA RAIZ n

        boolean primo2 = true;

        if (n < 2) {
            primo2 = false;
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    primo2 = false;
                    break;
                }
            }
        }

        // =========================================
        // RESULTADOS
        // =========================================

        System.out.println("METODO 1: ");

        if (primo1) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }

        System.out.println("METODO 2: ");

        if (primo2) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }

        sc.close();
    }
}
