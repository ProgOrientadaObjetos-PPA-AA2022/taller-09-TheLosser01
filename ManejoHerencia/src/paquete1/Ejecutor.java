/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete3.PrestamoAutomovil;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Que tipo de Prestamo quiere Realizar?\n");
        System.out.println("1) Prestamo Automovil\n");
        System.out.println("2) Prestamo Educativo\n");
        int entrada = sc.nextInt();
        if (entrada > 2 || entrada < 1) {
            System.out.println("Opcion incorrecta");
        } else {
            sc.nextLine();
            System.out.println("Ingrese Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese Apellidos: ");
            String apellido = sc.nextLine();
            System.out.println("Ingrese Username: ");
            String username = sc.nextLine();
            System.out.println("Prestamo");
            System.out.println("Tiempo del Prestamo en meses: ");            
            int tiempo = sc.nextInt();
            System.out.println("Ciudad donde se realiza el Prestamo: ");
            String cuidad = sc.nextLine();
            switch (entrada){
                case (1):
                    sc.nextLine();
                    System.out.println("Prestamo Automovil");
                    System.out.println("Tipo de automovil: ");
                    String tipo = sc.nextLine();
                    System.out.println("Marca del automovil: ");
                    String marca = sc.nextLine();
                    System.out.println("Garante");
                    System.out.println("Nombre: ");
                    String nombre1 = sc.nextLine();
                    System.out.println("Apellido: ");
                    String apellido1 = sc.nextLine();
                    System.out.println("Username: ");
                    String user1 = sc.nextLine();
                    System.out.println("Valor del automovil:");
                    double valor = sc.nextDouble();
                    System.out.println("Valor Mensual de pago:");
                    double valorM = sc.nextDouble();
                    PrestamoAutomovil presAuto = new PrestamoAutomovil();
                    
            }

        }
    }

}
