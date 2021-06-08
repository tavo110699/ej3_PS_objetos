/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allcreativelive.ej3_ps_objetos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        Cuadrado cuadrado = new Cuadrado();
        Cubo cubo = new Cubo();
        float lado = 0;
        int opcion = 0;

        try {
            String menu = "Menu (Seleccione la opcion numerica):\n"
                    + "1. Calcular Área de un Cuadrado\n"
                    + "2. Calcular Perímetro de un Cuadrado\n"
                    + "3. Calcular Volumen de un Cubo\n"
                    + "4. Calcular Perímetro de un Cubo\n"
                    + "5. Ingresar nuevo lado\n"
                    + "6. Salir\n"
                    + "Selecciona una opcion:";

            System.out.println("Ingrese el lado de su cuadrado o cubo");
            lado = scan.nextFloat();
            cuadrado.setLado(lado);
            cubo.setLado(lado);
            do {
                System.out.println("El valor del lado es: " + lado);
                System.out.println(menu);
                opcion = scan.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("El Área del cuadrado es: " + cuadrado.calcularArea() );
                        System.out.println("Presione ENTER para continuar");
                        break;
                    case 2:
                        System.out.println("El Perímetro del cuadrado es: " + cuadrado.calcularPerimetro());
                        System.out.println("Presione ENTER para continuar");
                        scan.nextLine();
                        break;
                    case 3:
                        System.out.println("El Volumen del Cubo es: " + cubo.calcularVolumen());
                        System.out.println("Presione ENTER para continuar");
                        scan.nextLine();
                        break;
                    case 4:
                        System.out.println("El Perimétro del cubo es: " + cubo.calcularPerimetro());
                        System.out.println("Presione ENTER para continuar");
                        scan.nextLine();
                        break;
                    case 5:
                        System.out.println("Ingrese el lado de su cuadrado o cubo");
                        lado = scan.nextFloat();
                        cuadrado.setLado(lado);
                        cubo.setLado(lado);
                        System.out.println("Presione ENTER para continuar");
                        break;
                }
                if (opcion != 6) {
                    try {
                        System.in.read();
                    } catch (IOException e) {
               
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Saliendo");
                }
            } while (opcion != 6);

        } catch (Exception e) {
            System.err.println("Ingrese una opcion valida");
        }
    }
}
