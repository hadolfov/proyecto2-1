/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.pkg1;

import java.util.Scanner;


/**
 *
 * @author Laboratorio CISCO
 */
public class Proyecto21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String tecla;
        persona p = new persona();
        do {
            p.registrar();
            p.imprimirDatos();
            System.out.print("Desea salir? S/N: ");
            tecla = lector.next().substring(0, 1).toUpperCase();
        } while (!"S".equals(tecla));
    } 
}
