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
        
        do {
            persona p1 =  new persona();
            p1.registrar();
            p1.imprimirDatos();
            
           
            System.out.print("Digite el nombre: ");
            String nombre = lector.next();
            System.out.print("Digite el apellido: ");
            String apellido = lector.next();
            System.out.print("Digite la edad: ");
            String edad = lector.next();
            System.out.print("Digite el sexo: ");
            String sexo = lector.next();
            
            persona p2 =  new persona(nombre);            
            p2.imprimirDatos();
            
            persona p3 =  new persona(nombre,apellido);            
            p3.imprimirDatos();
            
            persona p4 =  new persona(nombre,apellido,edad);            
            p4.imprimirDatos();
            
            persona p5 =  new persona(nombre,apellido,edad,sexo);            
            p5.imprimirDatos();
            
            System.out.print("Desea salir? S/N: ");
            tecla = lector.next().substring(0, 1).toUpperCase();
        } while (!"S".equals(tecla));
    } 

    public Proyecto21() {
    }
}
